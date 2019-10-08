/*
Nome do programa: Lt01_ModProc25
Objetivo: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e 
          minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc25{
    static int HoraInicial, MinInicial, HoraFinal, MinFinal, HAux, MinAux;
    public static void main (String[] args){
        HoraInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a Hora Inicial"));
        MinInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite os Minutos Iniciais"));
        HoraFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a Hora Final"));
        MinFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite os Minutos Finais"));
        ProcedureTempo();    
        JOptionPane.showMessageDialog(null, HAux + ":" + MinAux);
    }
    
    static void ProcedureTempo(){
        if (HoraFinal > HoraInicial){
            HAux = (HoraFinal - HoraInicial);
        }
        else{
            HAux = ((HoraFinal + 24) - HoraInicial);
        }
        if (MinFinal > MinInicial){
            MinAux = (MinFinal - MinInicial);
        }
        else{
            MinAux = ((MinFinal + 60) - MinInicial);
            HAux = HAux - 1;
        }
    }
}