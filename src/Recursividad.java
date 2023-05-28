
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author darie
 */
public class Recursividad {
    
    //METODOS EJERCICIO1
     public int invertirCifras(int numInv) {
        return invertirCifrasR(numInv, 0);
    }

    private int invertirCifrasR(int numeroInvR, int resultado) {
        if (numeroInvR < 10) {
            return resultado * 10 + numeroInvR;
        } else {
            int ultimaCifra = numeroInvR % 10;
            int resto = numeroInvR / 10;
            int invertido = invertirCifrasR
            (resto, resultado * 10 + ultimaCifra);
            return invertido;
        }
    }
    
    //METODOS EJERCICIO2
    public void imprimirLetraPorLetra(String texto) {
        imprimirLetraPorLetraR(texto, 0);
    }
    
    private void imprimirLetraPorLetraR(String texto, int indice) {
        if (indice < texto.length()) {
            char letra = texto.charAt(indice);
            JOptionPane.showMessageDialog(null, String.valueOf(letra));
            imprimirLetraPorLetraR(texto, indice + 1);
        }
    }
    
    //METODOS EJERCICIO3
     public void operarVectorRecursivo(int[] vector, int indice, int mayor) {
        if (indice < vector.length) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog
            ("Ingrese el valor para la posición " + indice + ": "));
            vector[indice] = valor;
            
            JOptionPane.showMessageDialog(null, "Elemento en la posición " + 
                                            indice + ": " + vector[indice]);

            if (vector[indice] > mayor) {
                mayor = vector[indice];
            }

            operarVectorRecursivo(vector, indice + 1, mayor);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "El mayor valor almacenado en el vector es: " + mayor);
        }
    }
    
     //METODOS EJERCICIO4
         public int solicitarYSumarNumeros() {
        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog
        ("Ingrese la cantidad de números a sumar:"));
        
        if (cantidadNumeros == 0) {
            return 0;
        } else {
            int numero = Integer.parseInt(JOptionPane.showInputDialog
            ("Ingrese el número:"));
            return numero + solicitarYSumarNumeros(cantidadNumeros - 1);
        }
    }
    
    private int solicitarYSumarNumeros(int cantidadNumeros) {
        if (cantidadNumeros == 0) {
            return 0;
        } else {
            int numero = Integer.parseInt(JOptionPane.showInputDialog
            ("Ingrese el número:"));
            return numero + solicitarYSumarNumeros(cantidadNumeros - 1);
        }
    }
     //METODOS EJERCICIO5
    public void mostrarTablaMultiplicar(int numero, int multiplicador, 
                                        StringBuilder tablaMultiplicar) {
        if (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            tablaMultiplicar.append(numero).append(" x ").append(multiplicador).
                    append(" = ").append(resultado).append("\n");
                    mostrarTablaMultiplicar
                    (numero, multiplicador + 1, tablaMultiplicar);
        }
    }
    //METODOS EJERCICIO6
    public int sumarDigitos(int numero) {
    if (numero < 10) {
        return numero;
    } else {
        int ultimoDigito = numero % 10;
        int resto = numero / 10;
        return ultimoDigito + sumarDigitos(resto);
    }
}
}
