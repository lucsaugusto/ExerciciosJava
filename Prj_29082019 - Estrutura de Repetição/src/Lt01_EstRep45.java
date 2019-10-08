/*
Nome do programa: Lt01_EstRep45
Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep45 {
    public static void main (String[] args){
        double Serie = 1, Cont;
        for (Cont = 2; Cont <= 15; Cont++) {
            if (Cont % 2 == 0) {
                Serie = Serie - (Cont/(Cont*Cont));
            }
            else {
                Serie = Serie + (Cont/(Cont*Cont));
            }          
        }
        JOptionPane.showMessageDialog(null, "Resultado da série: " + Serie);
    }
}
