/*
Nome do programa: Lt01_EstSeq04
Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em Fahrenheit F=(9*C+160)/5.
Nome do programador: Lucas Augusto
Data da criação: 15/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq04
{
    public static void main(String[] args)
    {
        double Celsius, Fahrenheit;
        Celsius = Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DA TEMPERATURA EM CELSIUS"));
        Fahrenheit = (9*Celsius+160)/5;
        JOptionPane.showMessageDialog(null,"TEMPERATURA EM FAHRENHEIT: " + Fahrenheit);
    }
}
