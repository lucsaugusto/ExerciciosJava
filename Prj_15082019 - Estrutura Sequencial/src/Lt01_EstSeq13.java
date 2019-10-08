/*
Nome do programa: Lt01_EstSeq13
Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
    durará esse alimento sabendo que a pessoa consome 50g ao dia.
Nome do programador: Lucas Augusto
Data da criação: 18/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq13
{
    public static void main(String[] args)
    {
        double Quantidade, Dias;
        Quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantos quilos de alimento:"));
        Dias = (Quantidade*1000)/50;
        JOptionPane.showMessageDialog(null,Dias + " Dias.");
    }
}

