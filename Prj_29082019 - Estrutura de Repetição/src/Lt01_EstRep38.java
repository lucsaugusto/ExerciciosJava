/*
Nome do programa: Lt01_EstRep38
Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
          Obs.: somente valores positivos.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep38{
    public static void main (String[] args){
        int Maior, Numero, Menor, Count = 1;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        String Mostra = ""; 
        Maior = Numero;
        Menor = Numero;
        
        while (Count < 100){
            Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (Numero < Menor){
                Menor = Numero;
            }
            else{
                if (Numero > Maior){
                    Maior = Numero;
                }
            }
            Count = (Count + 1);
        }   
        JOptionPane.showMessageDialog(null, "MENOR: " + Menor + "\nMAIOR: "+ Maior);
    }
}
