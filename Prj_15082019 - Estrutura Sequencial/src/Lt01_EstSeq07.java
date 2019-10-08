/*
Nome do programa: Lt01_EstSeq07
Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq07
{
    public static void main(String[] args)
    {
        double C, L, A, Volume;
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento"));
        L = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura"));
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        Volume = C*L*A;
        JOptionPane.showMessageDialog(null,"Volume: "+Volume);
    }
}
