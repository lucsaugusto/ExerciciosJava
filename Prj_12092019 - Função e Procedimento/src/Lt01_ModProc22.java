/*
Nome do programa: Lt01_ModProc22
Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc22 {
    static int N1, N2, Troca;
        public static void main(String[] args) {
            N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
            Ordena();
        }
        
    static void Ordena() {
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
