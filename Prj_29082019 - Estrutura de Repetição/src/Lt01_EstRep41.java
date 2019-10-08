/*
Nome do programa: Lt01_EstRep41
Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep41{
    public static void main (String[] args){
        int Dado1 = 1, Dado2 = 6, Soma = 0;
        String Mostra = "";
        
        while(Dado1 <= 6){
            while(Dado2 >= 1){
                Soma = Dado2 + Dado1;
                if (Soma == 7){
                    Mostra += (Dado1 + "+" + Dado2 + " = 7\n");
                }
                Dado2 -= 1;
            }
            Dado2 = 6;
            Soma = 0;
            Dado1 += 1; 
        }
        JOptionPane.showMessageDialog(null, "Possibilidades:\n" + Mostra);
    }
}
