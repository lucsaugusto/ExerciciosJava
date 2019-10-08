/*
Nome do programa: Lt01_ModFunc41
Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc41{
    public static void main (String[] args){
        int Dado1 = 1, Dado2 = 6;
        
        JOptionPane.showMessageDialog(null, "Possibilidades:\n" + FuncaoDado(Dado1, Dado2));
    }
    
    static String FuncaoDado(int D1, int D2){
        String Mostra = "";
        int Soma = 0;
        while(D1 <= 6){
            while(D2 >= 1){
                Soma = D2 + D1;
                if (Soma == 7)
                {
                    Mostra += (D1 + "+" + D2 + " = 7\n");
                }
                D2 -= 1;
            }
            D2 = 6;
            Soma = 0;
            D1 += 1; 
        }
        return Mostra;
    }
}