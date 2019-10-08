/*
Nome do programa: Lt01_ModFunc39
Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
          Casa: 	1	2	3	4	...	64
          Qdte:         1	2	4	8	...	N

Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc39
{
    public static void main (String[] args){
        double Casa = 64, Qtde = 1;
        JOptionPane.showMessageDialog(null, FuncaoTabuleiro(Casa, Qtde));
    }
    
    static String FuncaoTabuleiro(double C, double Q){
        String Mostra = "";
        double Soma = 0, Count = 1;
        while (Count < C){
            Mostra += ("\nCASA: " + (int)Count + " | QUANTIDADE: " + Q);
            Soma = Soma + Q;
            Q = Q * 2;
            Count += 1;
        }
        Mostra += ("\nSOMA DO TABULEIRO: " + Soma);
        return Mostra;
    }
}
