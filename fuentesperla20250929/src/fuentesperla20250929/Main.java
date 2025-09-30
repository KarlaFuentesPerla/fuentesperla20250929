/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuentesperla20250929;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAMOS VARIABLE
        busquedabinaria buscar = new busquedabinaria();
        
        //VALOR UNIDIMENSIONAL
        int[] arreglo={17,19,21,23,25,27,29,31};
        
        int[][] matriz ={
            {1,3,5},
            {7,9,11},
            {13,15,7}
        };
        
        
        int a_buscar = 19;
        
        int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);
        if(posicion!=-1){
            System.out.println("El valor: "+a_buscar+" está en la posición: "+posicion);
        }else{
            System.out.println("No se encontró el valor de "+a_buscar);
        }
        
        buscar.buscarEnteroMatriz(matriz, a_buscar);

    }

    
    
}
