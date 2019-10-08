/*
Nome do programa: Lt01_EstRec02
Objetivo: Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
Nome do programador: Lucas Augusto
Data da criação: 19/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRec02 {
    public static void main (String[] args) {
        int Num, Serie;
        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        Serie = FSerie(Num);
        JOptionPane.showMessageDialog(null, "Série = " + Serie);
    }
    
    static int FSerie(int N){
        int Serie;
        if (N == 1) {
            return N;
        }
        else {
            Serie = (N + FSerie(N-1));
            return Serie;
        }
    }
}