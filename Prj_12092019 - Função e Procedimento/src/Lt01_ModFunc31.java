/*
Nome do programa: Lt01_ModFunc31
Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
Nome do programador: Lucas Augusto
Data da criação: 22/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc31{
    public static void main (String[] args){
        int Numero = 10;
        JOptionPane.showMessageDialog(null, FuncaoMostra(Numero));
    }
    
    static String FuncaoMostra(int Num){
        int Quadrado = 0;
        String Mostra = "";
        while (Num <= 150){
            Quadrado = (Num * Num);
            Mostra += ("\nQuadrado de " + Num + " é " + Quadrado);
            Num = Num + 1;
            }
        return Mostra;
    }
}