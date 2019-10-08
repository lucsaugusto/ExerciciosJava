/*
Nome do programa: Lt01_EstRep42
Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep42{
    public static void main (String[] args){
        double Numero1 = 0, Numero2 = 1, Count = 1, Soma = 0, Aux = 0;
        String Mostra = "";
        
        while(Count <=50){
            Numero1 = Count;
            Soma = Soma + (Numero1 / Numero2);
            Aux = Numero1 / Numero2;
            Mostra += ((int)Numero1 + "/" + (int)Numero2 + " = " + Aux + "\n");
            Numero2 = Numero2 + 2;
            Count += 1;
        }
        JOptionPane.showMessageDialog(null, "SERIE:\n" + Mostra + "\nSOMA: " + Soma);
    }
}
