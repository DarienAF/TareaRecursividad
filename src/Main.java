//Prueba Pull
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author darie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EJERCICIO 1
       Recursividad recursividad1 = new Recursividad();
        int numeroE1 = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite un número:"));
        int resultado = recursividad1.invertirCifras(numeroE1);
        
        JOptionPane.showMessageDialog(null, "Número original: " +
                numeroE1 + "\n" + "Número invertido: " + resultado);
        
        //EJERCICIO 2
        Recursividad recursividad2 = new Recursividad();
        String texto = JOptionPane.showInputDialog("Digite una palabra:");
        
        JOptionPane.showMessageDialog(null, texto + " letra por letra es:");
        recursividad2.imprimirLetraPorLetra(texto);
        
        //EJERCICIO 3
        Recursividad recursividad3 = new Recursividad();
        int size = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el tamaño del vector: "));

        int[] vector = new int[size];

        JOptionPane.showMessageDialog(null, "Digite un valor al vector:");

        recursividad3.operarVectorRecursivo(vector, 0, Integer.MIN_VALUE);
        
        //EJERCICIO 4
        Recursividad recursividad4 = new Recursividad();
        
        int resultadoE4 = recursividad4.solicitarYSumarNumeros();
        
        JOptionPane.showMessageDialog(null, "La suma de los números corresponde"
                + " a: " + resultadoE4);
        
        //EJERCICIO 5
        Recursividad recursividad5 = new Recursividad();
        
        int numeroE5 = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el numero cuya tabla de multiplicar desea:"));
        
        StringBuilder tablaMultiplicar = new StringBuilder();
        tablaMultiplicar.append("Tabla de multiplicar del número ")
                .append(numeroE5).append(":\n");
        
        recursividad5.mostrarTablaMultiplicar(numeroE5, 1, tablaMultiplicar);
        
        JOptionPane.showMessageDialog(null, tablaMultiplicar.toString());
        
        //EJERCICIO 6
        Recursividad recursividad6 = new Recursividad();

        int numeroE6 = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite un número:"));

        int suma = recursividad6.sumarDigitos(numeroE6);

        JOptionPane.showMessageDialog(null, "La suma de los dígitos del número " 
                + numeroE6 + " es: " + suma);
    }
    }


