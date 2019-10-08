/*
Nome do programa: Lt01_ModFunc33
Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc33{
    public static void main (String[] args){
        double Numero;
        Numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número a ser calculado"));
        JOptionPane.showMessageDialog(null, FuncaoSerie(Numero));
    }
    
    
    static String FuncaoSerie(double Num){
        String Mostra = "1"; 
        double Serie = 0;
        double Count = 1;
        while (Count <= Num){
            Serie = (Serie + (1/Count));
            Mostra += (" + 1/" + (int)Count);
            Count = (Count + 1);
        }
        Mostra += (" = " + Serie);
        return Mostra;
    }
}
