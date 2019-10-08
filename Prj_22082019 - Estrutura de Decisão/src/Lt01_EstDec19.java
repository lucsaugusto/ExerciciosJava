/*
Nome do programa: Lt01_EstDec19
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
Nome do programador: Lucas Augusto
Data da criação: 19/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstDec19
{
    public static void main(String[] args)
    {
        double N1, N2;
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite número real:"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número real:"));
        if (N1>N2)
        {
            JOptionPane.showMessageDialog(null,"O maior valor é "+N1);
        }
        else if(N2>N1)
        {
            JOptionPane.showMessageDialog(null,"O maior valor é "+N2);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Os valores são iguais.");
        }
    }
}