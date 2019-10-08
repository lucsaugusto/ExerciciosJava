/*
Nome do programa: Lt01_EstDec25
Objetivo: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos,
sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Nome do programador: Lucas Augusto
Data de criação: 20/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstDec25 {
    public static void main (String[] args) {
        int HI, MI, HF, MF, HX, MX;
        HI = Integer.parseInt(JOptionPane.showInputDialog("Qual a hora de início da partida?"));
        MI = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos?"));
        HF = Integer.parseInt(JOptionPane.showInputDialog("Qual a hora de final da partida?"));
        MF = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos?"));
        if (HI < HF) {
            HX = HF - HI;
        }
        else {
            HX = 24 - (HI - HF);
        }
        
        if (MI <= MF) {
            MX = MI - MF;
        }
        else {
            MX = 60 - (MI - MF);
            HX = HX - 1;
        }
        JOptionPane.showMessageDialog(null, "A partida durou: " + HX + ":" + MX );
    }
}
