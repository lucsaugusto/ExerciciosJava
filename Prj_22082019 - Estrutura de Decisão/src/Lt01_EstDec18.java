/*
Nome do programa: Lt01_EstDec18
Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
Nome do programador: Lucas Augusto
Data da criação: 19/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstDec18
{
    public static void main(String[] args)
    {
        int N1, N2, Diferenca;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
        if (N1>N2)
        {
            Diferenca = N1 - N2;
        }
        else
        {
            Diferenca = N2 - N1;
        }
        JOptionPane.showMessageDialog(null,"A diferença é: "+Diferenca);
    }
}