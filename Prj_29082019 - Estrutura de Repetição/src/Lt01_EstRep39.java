/*
Nome do programa: Lt01_EstRep39
Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
          Casa: 1 2 3 4 ... 64
          Qdte:         1 2 4 8 ... N
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep39{
    public static void main (String[] args){
        double Casa = 64, Qtde = 1, Soma = 0, Count = 1;
        String Mostra = "";
        
        while (Count < Casa){
            Mostra += ("\nCASA: " + (int)Count + " | QUANTIDADE: " + Qtde);
            Soma = Soma + Qtde;
            Qtde = Qtde * 2;
            Count += 1;
        }
        JOptionPane.showMessageDialog(null, Mostra + "\nSOMA DO TABULEIRO: "+ Soma);
    }
}
