/*
Nome do programa: Lt01_EstSeq01
Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
Nome do programador: Lucas Augusto
Data da criação: 15/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq01
{
    public static void main(String[] args)
    {
        int Lado, Area;
        Lado = Integer.parseInt(JOptionPane.showInputDialog("DIGITE VALOR DO LADO"));
        Area = (Lado*Lado);
        JOptionPane.showMessageDialog(null,"A AREA DO QUADRADO " + Area);
    }
}
