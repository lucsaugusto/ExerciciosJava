/*
Nome do programa: Lt01_ModFunc35
Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
          Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc35{
    public static void main (String[] args){
        int Numero1, Numero2;
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número a ser calculado"));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número a ser calculado"));
        JOptionPane.showMessageDialog(null, FuncaoImpares(Numero1, Numero2));
    }
    
    static String FuncaoImpares(int Num1, int Num2){
        int SomaImp = 0, Count = 0, Aux;
        String Mostra = "ÍMPARES:\n"; 
        if (Num1 > Num2){
            Aux = Num1;
            Num1 = Num2;
            Num2 = Aux;
        }
        Count = Num1 + 1;
        
        while (Count < Num2){
            if (Count % 2 != 0){
                Mostra += (Count + "\n");
                SomaImp = SomaImp + Count;
            }
            Count = Count + 1;
        }
        Mostra += ("SOMA DOS ÍMPARES: " + SomaImp);
        return Mostra;
    }
}
