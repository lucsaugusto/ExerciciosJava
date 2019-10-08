/*
Nome do programa: Lt01_EstRep43
Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep43 {
    public static void main (String[] args) {
        double Ana = 1.10, Maria = 1.5, Anos = 0;
        while(Ana < Maria) {
            Ana = Ana + 0.03;
            Maria = Maria + 0.02;
            Anos++;
        }
        Anos = Anos + 1;
        JOptionPane.showMessageDialog(null, (int)Anos + " Anos");  
    }
}
