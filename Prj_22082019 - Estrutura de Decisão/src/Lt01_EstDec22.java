/*
Nome do programa: Lt01_EstDec22
Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Nome do programador: Lucas Augusto
Data de criação: 20/08/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec22 {

    public static void main(String[] args) {
        int N1, N2, Troca;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
        if (N1 == N2) {
            JOptionPane.showMessageDialog(null, "Números iguais, reinicie o código.");
        } 
        else {
            if (N1 > N2) {
                Troca = N1;
                N1 = N2;
                N2 = Troca;
            }
            JOptionPane.showMessageDialog(null, N1 + " e " + N2);
        }
    }
}
