/*
Nome do programa: Lt01_ModProc26
Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc26{
    static int Valor1, Valor2;
    public static void main (String[] args){
        Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor 1:"));
        Valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor 2:"));
        ProcedureMultiplo();
    }
    
    static void ProcedureMultiplo(){
        if (Valor1 > Valor2){
            if (Valor1 % Valor2 == 0){
                JOptionPane.showMessageDialog(null, Valor1 + " é multiplo de " + Valor2);
            }
            else{
                JOptionPane.showMessageDialog(null, Valor1 + " não é multiplo de " + Valor2);
            }
        }
        else{
            if (Valor2 % Valor1 == 0){
                JOptionPane.showMessageDialog(null, Valor2 + " é multiplo de " + Valor1);
            }
            else{
                JOptionPane.showMessageDialog(null, Valor2 + " não é multiplo de " + Valor1);
            }
        }
    }
}