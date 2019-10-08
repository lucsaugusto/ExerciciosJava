/*
Nome do programa: Lt01_ModProc17
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
    Receber o tempo de percurso e a velocidade média.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc17 {
    static double TempoPercurso, VelocidadeMedia, Litros;
        public static void main (String[] args){
            TempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em minutos:"));
            VelocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média em km/h:"));
            CalcLitros();
            JOptionPane.showMessageDialog(null,Litros+" Litros de combustível.");
        }

    static void CalcLitros(){
        Litros = ((TempoPercurso/60)*VelocidadeMedia)/12;
    }
}