/*
Nome do programa: Lt01_EstDec24
Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Nome do programador: Lucas Augusto
Data de criação: 20/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstDec24 {
    public static void main (String[] args) {
        int N;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
        if (N%2 == 0 && N%3 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 2 e 3.");
        }
        else if (N%2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível apenas por 2.");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número é divisível apenas por 3.");
        }
    }
}
