/*
Nome do programa: Lt01_EstRep40
Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep40{
    public static void main (String[] args){
        double Numero1, Numero2, Aux = 0, Count = 2, Num1, Num2;
        Numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        Numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        String Mostra = "\nNÚMEROS PRIMOS ENTRE " + (int)Numero1 + " E " + (int)Numero2 + ":\n";
        
        if(Numero1 == 1){
            Numero1 = 2;
        }
        while (Numero1 <= Numero2){
            while (Count <= (Numero1/2)){
                if (Numero1 % Count == 0){
                    Aux = -1;
                    Count = Numero1;
                }
                else{
                    Aux = 0;
                }
                Count += 1;
            }
            Count = 2;
            if (Aux == 0){
                Mostra += ((int)Numero1 + "\n");
            }
            Numero1 += 1;
            
        }
        JOptionPane.showMessageDialog(null, Mostra);
    }
}
