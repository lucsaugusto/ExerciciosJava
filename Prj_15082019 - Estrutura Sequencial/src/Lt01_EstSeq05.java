/*
Nome do programa: Lt01_EstSeq05
Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau(AX²+BX+C=0). 
Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
Nome do programador: Lucas Augusto
Data da criação: 16/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq05
{
    public static void main(String[] args)
    {
        double A, B, C, Delta, X1, X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'A'"));
        B = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'B'"));
        C = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'C'"));
        Delta = (B*B)-4*A*C;
        X1 = ((-B)+ java.lang.Math.sqrt(Delta))/(2*A);
        X2 = ((-B)- java.lang.Math.sqrt(Delta))/(2*A);
        JOptionPane.showMessageDialog(null,"AS RAIZES SAO X1: "+ X1 +" E X2: "+ X2);
    }
}
