/*
Nome do programa: Lt01_EstDec26
Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Nome do programador: Lucas Augusto
Data de criação: 21/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstDec26 {
    public static void main (String[] args) {
        int N1, N2, Aux;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
        if (N1 < N2) {
            Aux = N1;
            N1 = N2;
            N2 = Aux;
        }
        if (N1%N2 == 0) {
            JOptionPane.showMessageDialog(null, N1 + " é múltiplo de " + N2 +".");
        }
        else {
            JOptionPane.showMessageDialog(null, "Os números não são múltiplos.");
        }
    }
}
