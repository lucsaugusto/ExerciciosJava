/*
Nome do programa: Lt01_EstRep36
Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep37{
    public static void main (String[] args){
        int Fibo, Numero, Aux1 = 1, Aux2 =1, Count = 3;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo a ser calculado"));
        String Mostra = "";
        
        if (Numero >= 1){
            Mostra += ("1\n");
            if (Numero >= 2){
                Mostra += ("1\n");
            }
        }
        while (Count <= Numero){
            Fibo = Aux1 + Aux2;
            Aux2 = Aux1;
            Aux1 = Fibo;
            Count = Count + 1;
            Mostra += (Fibo + "\n");
        }   
        JOptionPane.showMessageDialog(null, "SÉRIE FIBONACCI ATÉ O " + Numero + "º TERMO:\n"+ Mostra);
    }
}
