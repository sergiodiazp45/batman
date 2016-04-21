

package paquete;

import javax.swing.JOptionPane;  //librerias



public class claseprincipal {//nombre de la clase 
  
public static void main(String[]args){

    int numero1;
    int numero2;
    float numero3;
    int resultado; //almacenara suma
    float resultado2; //almacenara multiplicación
    double resultado3; // almacenara raiz cuadrada
    
    
   numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer número")); // se ingresa el dato 1, como es una variable entera, se realiza una conversión de String a entero.
   numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo número")); // se ingresa el dato 2, como es una variable entera, se realiza una conversión de String a entero.
   numero3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del tercer número")); // se ingresa el dato 3, como es una variable float, se realiza una conversión de String a float.
   
   resultado = numero1 + numero2; // Se realiza la operación entre enteros
   resultado2= numero3 * Float.parseFloat(Integer.toString(resultado)); //se multiplica el entero anterior con el número decimal. Aca se convierte el numero entero a String, luego de String a float. NOTA: No es necesario las conversiones, simplemente es por practicar
   resultado3= resultado2 * Math.sqrt(resultado); // le saca raiz cuadrada a resultado y lo multiplica por resultado2
   
   
   JOptionPane.showMessageDialog(null,"El resultado de la suma entera  es: " + Integer.toString(resultado)); // se muestra la operación. EL comando Integer.toString(variable) convierte esa variable en un String, esto con el fin de mostrarse correctamente
   JOptionPane.showMessageDialog(null,"El resultado de la multiplcación  es: " + Float.toString(resultado2));
   JOptionPane.showMessageDialog(null,"El resultado de la multiplicación con raiz  es: " + Double.toString(resultado3));
}


}
