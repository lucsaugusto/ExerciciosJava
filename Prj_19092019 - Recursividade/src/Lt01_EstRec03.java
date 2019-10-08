/*
Nome do programa: Lt01_EstRec03
Objetivo: Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
Nome do programador: Lucas Augusto
Data da criação: 19/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRec03 {
    public static void main (String[] args) {
        double Num, Serie;
        Num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        Serie = FSerie(Num);
        JOptionPane.showMessageDialog(null, "Série = " + Serie);
    }
    
    static double FSerie(double N){
        double Serie;
        if (N == 1) {
            return N;
        }
        else {
            Serie = ((1/N) + FSerie(N - 1));
            return Serie;
        }
    }
}