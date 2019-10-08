/*
Nome do programa: Lt01_EstSeq02
Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
Nome do programador: Lucas Augusto
Data da criação: 15/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq02
{
    public static void main(String[] args)
    {
        double Salario, SalarioR;
        Salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DO SALARIO"));
        SalarioR = (Salario*1.15);
        JOptionPane.showMessageDialog(null,"SALARIO REAJUSTADO: " + SalarioR);
    }
}
