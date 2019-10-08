/*
Nome do programa: Lt01_EstSeq06
Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq06
{
    public static void main(String[] args)
    {
        double X, Y, Troca;
        X = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'X'"));
        Y = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DE 'Y'"));
        Troca = X;
        X = Y;
        Y = Troca;
        JOptionPane.showMessageDialog(null,"X: "+X+" E Y: "+Y);
    }
}
