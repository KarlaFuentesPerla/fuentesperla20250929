/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fuentesperla20250929;

/**
 *
 * @author UFG
 */
public class busquedabinaria {
    // MÉTODO PARA REALIZAR UNA BÚSQUEDA BINARIA
    public int buscarEnteroArray(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == valorBuscado) {
                return medio;
            } else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        // Si no se encuentra el valor, se retorna -1
        return -1;
    }
    
    
    //METODO PARA BUSCAR UN VALOR EN MATRIZ
    public void buscarEnteroMatriz(int[][] matriz, int objetivo){
        
        //SE DECLARAN LAS FILAS Y LAS COLUMNAS PARA CONOCER LA DIMENSIÓN DE LA MATRIZ
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        //INICIO Y FIN DE LA MATRIZ
        int inicio = 0;
        int fin = (filas*columnas)-1;
        
        //BANDERA QUE INDICA SI EL VALOR FUE ENCONTRADO
        boolean encontrado = false;
        
        //REPETICION MIENTRAS LA MATRIZ POSEA AL MENOS UN ELEMENTO
        while(inicio<=fin){
            
            //SE DEDUCE PUNTO MEDIO DE LA MATRIZ
            int medio = (inicio + fin)/2;
            
            //SE SIMULA EL ARREGLO BIDIMENSIONAL COMO UN ARREGLO UNIDIMENSIONAL
            int f = medio / columnas;
            int c = medio%columnas;
            
            if (matriz[f][c]==objetivo){
                System.out.println("En la matriz, el elemento encontrado está en la posición [" + f + "] [" + c + "]");
                encontrado = true;
                break;
            }else if (matriz [f][c]<objetivo){
                inicio = medio + 1;
            }else{
                fin = medio-1;
            }
        }
        
        if (encontrado==false){
            System.out.println("El elemento buscado no ha sido encontrado en la matriz");
        }
    }
}

