/*
Nome do programa: Lt01_EstRec01
Objetivo: Serie1 = (1+2+3+...+100)
Nome do programador: Lucas Augusto
Data da criação: 19/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRec01 {
    public static void main (String[] args) {
        int Num = 1, Serie;
        Serie = FSerie(Num);
        JOptionPane.showMessageDialog(null, "Série = " + Serie);
    }
    
    static int FSerie(int N){
        int Serie;
        if (N == 100){
            return N;
        }
        else {
            Serie = (N + FSerie(N+1));
            return Serie;
        }
    }
}
