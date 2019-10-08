/*
Nome do programa: Lt01_EstSeq12
Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq12
{
    public static void main(String[] args)
    {
        int Nasc, Atual, Idade;
        Nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        Atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        Idade = Atual - Nasc;
        JOptionPane.showMessageDialog(null,Idade + " Anos de idade.");
    }
}

