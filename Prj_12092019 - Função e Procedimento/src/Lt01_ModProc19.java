/*
Nome do programa: Lt01_ModProc19
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc19 {
    static double N1, N2;
        public static void main (String[] args) {
            N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite número real:"));
            N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número real:"));
            MostraMaior();
        }
        
    static void MostraMaior() {
        if (N1>N2){
            JOptionPane.showMessageDialog(null,"O maior valor é "+N1);
        }
        else if(N2>N1){
            JOptionPane.showMessageDialog(null,"O maior valor é "+N2);
        }
        else{
            JOptionPane.showMessageDialog(null,"Os valores são iguais.");
        }
    }
}
