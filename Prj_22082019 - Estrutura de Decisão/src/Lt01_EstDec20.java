/*
Nome do programa: Lt01_EstDec20
Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
    Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Nome do programador: Lucas Augusto
Data da criação: 19/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstDec20
{
    public static void main(String[] args)
    {
        double A, B, C, Delta, X1, X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'A'"));
        B = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'B'"));
        C = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'C'"));
        if (A == 0)
        {
            JOptionPane.showMessageDialog(null,"Não é equação do 2º grau.");
        }
        else
        {
            Delta = (B*B)-4*A*C;
            if (Delta >= 0)
            {
                X1 = ((-B)+ java.lang.Math.sqrt(Delta))/(2*A);
                X2 = ((-B)- java.lang.Math.sqrt(Delta))/(2*A);
                JOptionPane.showMessageDialog(null,"AS RAIZES SAO X1: "+ X1 +" E X2: "+ X2);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Não possui raízes reais.");
            }
            
        }
    }
}
