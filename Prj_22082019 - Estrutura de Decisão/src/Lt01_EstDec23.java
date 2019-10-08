/*
Nome do programa: Lt01_EstDec23
Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
    Mostre os 4 números em ordem crescente.
Nome do programador: Lucas Augusto
Data de criação: 20/08/2019
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec23 {
    public static void main (String[] args) {
        int N1, N2, N3, N4, Troca;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior:"));
        N3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ainda maior:"));
        N4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número aleatório:"));
        if (N2 < N1 || N3 < N2) {
            JOptionPane.showMessageDialog(null, "Você digitou errado, tente novamente!");
        }
        else{
            if (N4 <= N1) {
                JOptionPane.showMessageDialog(null, N4 + " | " + N1 + " | " + N2 + " | " + N3);
            }
            else if (N4 <= N2) {
                JOptionPane.showMessageDialog(null, N1 + " | " + N4 + " | " + N2 + " | " + N3);
            }
            else if (N4 <= N3) {
                JOptionPane.showMessageDialog(null, N1 + " | " + N2 + " | " + N4 + " | " + N3);
            }
            else {
                JOptionPane.showMessageDialog(null, N1 + " | " + N2 + " | " + N3 + " | " + N4);
            }
        }    
    }
}
