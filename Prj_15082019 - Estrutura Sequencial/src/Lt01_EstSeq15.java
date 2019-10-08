/*
Nome do programa: Lt01_EstSeq15
Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Nome do programador: Lucas Augusto
Data da criação: 19/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq15
{
    public static void main(String[] args)
    {
        double A, B, Hipotenusa;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto A:"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto B:"));
        Hipotenusa = java.lang.Math.sqrt(((A*A)+(B*B)));
        JOptionPane.showMessageDialog(null,"Valor da Hipotenusa: "+Hipotenusa);
    }
}