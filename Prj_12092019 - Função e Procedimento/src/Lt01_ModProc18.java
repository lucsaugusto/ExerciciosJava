/*
Nome do programa: Lt01_ModProc18
Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc18 {
    static int N1, N2, Diferenca;
        public static void main (String[] args){
            N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número:"));
            N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
            CalcDiferenca();
            JOptionPane.showMessageDialog(null,"A diferença é: "+Diferenca);
        }
        
    static void CalcDiferenca() {
        if (N1>N2) {
            Diferenca = N1 - N2;
        }
        else {
            Diferenca = N2 - N1;
        }
    }
}
