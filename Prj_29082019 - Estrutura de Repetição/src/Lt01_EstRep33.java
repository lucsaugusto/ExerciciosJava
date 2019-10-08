/*
Nome do programa: Lt01_EstDec33
Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Nome do programador: Lucas Augusto
Data de criação: 22/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstRep33 {
    public static void  main (String[] args) {
        double Num, Serie, Cont;
        Num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        Serie = 0;
        for (Cont = 1; Cont <= Num; Cont++) {
            Serie = Serie + 1 / Cont;
        }
        JOptionPane.showMessageDialog(null, "A série de |" + (int)Num + "| é : " + Serie);
    }
}
