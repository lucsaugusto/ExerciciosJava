/*
Nome do programa: Lt01_EstSeq17
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
    Receber o tempo de percurso e a velocidade média.
Nome do programador: Lucas Augusto
Data da criação: 19/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq17
{
    public static void main(String[] args)
    {
        double TempoPercurso, VelocidadeMedia, Litros;
        TempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso em minutos:"));
        VelocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média em km/h:"));
        Litros = ((TempoPercurso/60)*VelocidadeMedia)/12;
        JOptionPane.showMessageDialog(null,Litros+" Litros de combustível.");
    }
}