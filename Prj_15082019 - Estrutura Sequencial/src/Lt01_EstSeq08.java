/*
Nome do programa: Lt01_EstSeq08
Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação
sabendo que rende 1,3% a. m.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq08
{
    public static void main(String[] args)
    {
        double Deposito;
        Deposito = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do depósito?"));
        Deposito = Deposito*1.013;
        JOptionPane.showMessageDialog(null,"Deposito após rendimento: "+Deposito);
    }
}

