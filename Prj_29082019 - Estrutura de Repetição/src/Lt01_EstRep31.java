/*
Nome do programa: Lt01_EstDec31
Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
Nome do programador: Lucas Augusto
Data de criação: 22/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstRep31 {
    public static void main (String[] args) {
        int N, Quadrado;
        String Mostra="";
        for (N=10; N<=150;N++) {
            Quadrado = N * N;
            Mostra+=("\n Quadrado de " + N +" é igual a " + Quadrado);
            //System.out.println("\n Quadrado de " + N +" é igual a " + Quadrado);
        }
        JOptionPane.showMessageDialog(null, Mostra);
    }
}
