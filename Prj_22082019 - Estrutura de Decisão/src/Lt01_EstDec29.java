/*
Nome do programa: Lt01_EstDec29
Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
    Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
    Demais tipos não serão considerados.
Nome do programador: Lucas Augusto
Data de criação: 22/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstDec29 {
    public static void main (String[] args) {
        double Investimento, Tipo;
        Tipo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento.\n 1 - Poupança | 2 - Renda Fixa"));
        Investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento."));
        if (Tipo == 1) {
            Investimento = Investimento * 1.03;
        }
        else {
            Investimento = Investimento * 1.05;
        }
        JOptionPane.showMessageDialog(null, "Valor após 30 dias de rendimento: " + Investimento);
    }
}
