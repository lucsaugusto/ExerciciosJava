/*
Nome do programa: Lt01_EstRec05
Objetivo: Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
Nome do programador: Lucas Augusto
Data da criação: 19/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRec05
{
    public static void main (String args []) {
        int Num;
        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        JOptionPane.showMessageDialog(null, "Série = " + FSerie(Num));
    }
    
    static int FSerie(int N) {
        int Serie;
        if (N == 1) {
            return N;
        }
        else {
            Serie = FFat(N) + FSerie(N-1);
            return Serie;
        }
    }
    
    static int FFat(int N){
        int Fat;
        if (N == 1) {
            return 1;
        }
        else {
            Fat = N*FFat(N-1);
            return Fat;
        }
    }
}