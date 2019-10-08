/*
Nome do programa: Lt01_ModFunc38
Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
          Obs.: somente valores positivos.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc38{
    public static void main (String[] args){
        int Numero;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, FuncaoMaiorMenor(Numero));
    }
    
    static String FuncaoMaiorMenor(int Num){
        int Maior, Menor, Count = 1;
        String Mostra = ""; 
        Maior = Num;
        Menor = Num;
        
        while (Count < 10){
            Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (Num < Menor){
                Menor = Num;
            }
            else{
                if (Num > Maior){
                    Maior = Num;
                }
            }
            Count = (Count + 1);
        }   
        Mostra = ("MENOR: " + Menor + "\nMAIOR: "+ Maior);
        return Mostra;
    }
}
