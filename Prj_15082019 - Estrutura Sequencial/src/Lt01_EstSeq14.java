/*
Nome do programa: Lt01_EstSeq14
Objetivo: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Nome do programador: Lucas Augusto
Data da criação: 18/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq14
{
    public static void main(String[] args)
    {
        double A, B, C;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo A:"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo B:"));
        C = 180 - (A + B);
        JOptionPane.showMessageDialog(null,C + "º Graus.");
    }
}