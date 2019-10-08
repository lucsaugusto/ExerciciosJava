/*
Nome do programa: Lt01_ModFunc45
Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc45{
    public static void main (String[] args){
        double Serie = 1;
        JOptionPane.showMessageDialog(null, "Resultado da série: " + FuncaoSerie(Serie));
    }
    
    static double FuncaoSerie(double S){
        double Cont;
        for (Cont = 2; Cont <= 15; Cont++){
            if (Cont % 2 == 0){
                S = S - (Cont/(Cont*Cont));
            }
            else{
                S = S + (Cont/(Cont*Cont));
            }
        }
        return S;
    }
}