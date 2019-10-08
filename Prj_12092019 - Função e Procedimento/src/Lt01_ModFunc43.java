/*
Nome do programa: Lt01_ModFunc43
Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que
          Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc43{
    public static void main (String[] args){
        double Ana = 1.10, Maria = 1.5;
        JOptionPane.showMessageDialog(null, FuncaoAnaMaria(Ana, Maria) + " Anos");  
    }
    
    static int FuncaoAnaMaria(double A, double M){
        int Anos = 0;
        while(A < M){
            A = A + 0.03;
            M = M + 0.02;
            Anos++;
        }
        Anos = Anos + 1;
        return Anos;
    }
}