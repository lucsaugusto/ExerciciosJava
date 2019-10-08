/*
Nome do programa: Lt01_ModFunc34
Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc34{
    public static void main (String[] args){
        int Numero;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser calculado"));
        JOptionPane.showMessageDialog(null, FuncaoTabuada(Numero));
    }
    static String FuncaoTabuada(int Num){
        int Tabuada = 0, Count = 0;
        String Mostra = ""; 
        while (Count <= 10){
            Tabuada = (Num * Count);
            Mostra += ("\nTabuada de " + Num + " x " + Count + " = " + Tabuada);
            Count = (Count + 1);
        }
        return Mostra;
    }
}
