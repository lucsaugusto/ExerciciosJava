/*
Nome do programa: Lt01_ModFunc42
Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc42{
    public static void main (String[] args){
        double Numero1 = 0, Numero2 = 1;
        JOptionPane.showMessageDialog(null, FuncaoSerie(Numero1, Numero2));
    }
    
    static String FuncaoSerie(double Num1, double Num2){
        String Mostra = "SERIE:\n";
        double Count = 1, Soma = 0, Aux = 0;
        while(Count <=50){
            Num1 = Count;
            Soma = Soma + (Num1 / Num2);
            Aux = Num1 / Num2;
            Mostra += ((int)Num1 + "/" + (int)Num2 + " = " + Aux + "\n");
            Num2 = Num2 + 2;
            Count += 1;
        }
        Mostra += ("\nSOMA: " + Soma);
        return Mostra;
    }
}