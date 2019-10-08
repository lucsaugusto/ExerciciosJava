/*
Nome do programa: Lt01_EstSeq10
Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq10
{
    public static void main(String[] args)
    {
        double N1, N2, Resultado;
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número:"));
        Resultado = (N1*N1)+(N2*N2);
        JOptionPane.showMessageDialog(null,"Resultado: "+Resultado);
    }
}

