/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_copia_arreglos;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA1_14_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3];//12 bytes --> 3 enteros x 4bytes
        System.out.println("Direccion de iArreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        //iArreglo[3] = 3; //error: ArrayIndexOutOfBound --> Nos pasamos de los limites del arreglo
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA "+ i + " = $" + iArreglo[i]); 
        }
        //QUIERO UNA COPIA DE LOS DATOS DEL ARREGLO
        //int[] iCopia = iArreglo; 
        int[] iCopia = new int[3];
        System.out.println("Direccion de iCopia = " + iCopia);
        for (int i = 0; i < iArreglo.length; i++) {
            iCopia[i] = iArreglo[i];
        } 
        iCopia[0] = 1000000;
        for (int i = 0; i < iCopia.length; i++) {
            System.out.println("CUENTA (iCopia) " + i + " = $" + iArreglo[i]);

        } 
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA (iArreglo) " + i + " = $" + iArreglo[i]);
        }
    }
    
}
