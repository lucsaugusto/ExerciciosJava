/*
Nome do programa: Lt01_EstDec34
Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Nome do programador: Lucas Augusto
Data de criação: 28/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstRep34 {
    public static void main (String[] args) {
        int N, Aux, i;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número e veja sua tabuada."));
        String Mostra="";
        for (i = 1; i <= N; i++) {
            Aux = N * i;
            Mostra += ("\n" + N + "x" + i + " = " + Aux);
        }
        JOptionPane.showMessageDialog(null, Mostra);
    }
}
