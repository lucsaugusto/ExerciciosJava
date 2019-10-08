/*
Nome do programa: Lt01_ModFunc36
Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc36{
    public static void main (String[] args){
        double Numero;
        Numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número a ser calculado"));
        JOptionPane.showMessageDialog(null, FuncaoSerieFatorial(Numero));
    }
    
    static String FuncaoSerieFatorial(double Num){
        String Mostra = "1"; 
        double Fatorial, Count = 1, Serie = 1, Aux;
        while (Count <= Num){
            Aux = Count;
            Fatorial = Count;
            while (Aux > 1){
                Fatorial = (Fatorial * (Aux-1));
                Aux = Aux - 1;
            }
            Serie = (Serie + (1/Fatorial));
            Mostra += (" + 1/" + (int)Count + "!");
            Count = (Count + 1);
        }
        Mostra += (" = " + Serie);
        return Mostra;
    }
}
