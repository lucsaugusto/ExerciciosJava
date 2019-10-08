/*
Nome do programa: Lt01_ModFunc37
Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc37{
    public static void main (String[] args){
        int Numero;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo a ser calculado"));
        JOptionPane.showMessageDialog(null, FuncaoFibonacci(Numero));
    }
    
    static String FuncaoFibonacci(int Num){
        String Mostra = "SÉRIE FIBONACCI ATÉ O " + Num + "º TERMO:\n"; 
        int Fibo, Aux1 = 1, Aux2 =1, Count = 3;
        
        if (Num >= 1){
            Mostra += ("1\n");
            if (Num >= 2){
                Mostra += ("1\n");
            }
        }
        while (Count <= Num){
            Fibo = Aux1 + Aux2;
            Aux2 = Aux1;
            Aux1 = Fibo;
            Count = Count + 1;
            Mostra += (Fibo + "\n");
        }
        return Mostra;
    }
}
