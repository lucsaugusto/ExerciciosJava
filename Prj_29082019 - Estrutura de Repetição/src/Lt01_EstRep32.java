/*
Nome do programa: Lt01_EstDec32
Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
Nome do programador: Lucas Augusto
Data de criação: 22/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstRep32 {
    public static void main (String[] args) {
        int Fatorial, N, Aux;
        Fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        N = Fatorial;
        Aux = Fatorial;
        while (N>1) {
            Fatorial = Fatorial*(N-1);
            N = N-1;
        }
        JOptionPane.showMessageDialog(null, "Fatorial do número " + Aux + " é " + Fatorial);
    }
}
