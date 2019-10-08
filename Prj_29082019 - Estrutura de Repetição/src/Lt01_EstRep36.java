/*
Nome do programa: Lt01_EstRep36
Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep36{
    public static void main (String[] args){
        double Fatorial, Count = 1, Numero, Serie = 1, Aux;
        Numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número a ser calculado"));
        String Mostra = "1"; 
        
        while (Count <= Numero){
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
        JOptionPane.showMessageDialog(null, Mostra + " = " + Serie);
    }
}