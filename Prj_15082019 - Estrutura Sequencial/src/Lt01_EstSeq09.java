/*
Nome do programa: Lt01_EstSeq09
Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq09
{
    public static void main(String[] args)
    {
        int N1, N2, Resultado;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        Resultado = (N1*N1)+(N2*N2);
        JOptionPane.showMessageDialog(null,"Resultado: "+Resultado);
    }
}

