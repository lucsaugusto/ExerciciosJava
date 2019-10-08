/*
Nome do programa: Lt01_EstSeq03
Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
Nome do programador: Lucas Augusto
Data da criação: 15/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq03
{
    public static void main(String[] args)
    {
        double Base, Altura, Area;
        Base = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DA BASE"));
        Altura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DA ALTURA"));
        Area = (Base*Altura);
        JOptionPane.showMessageDialog(null,"AREA DO TRIANGULO: " + Area);
    }
}
