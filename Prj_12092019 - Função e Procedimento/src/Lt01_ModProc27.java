/*
Nome do programa: Lt01_ModProc27
Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
          Calcule e mostre a velocidade média em km/h.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc27{
    static int Voltas, Circuito, Duracao, VelMedia;
    public static void main (String[] args){
        Voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número de Voltas"));
        Circuito = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do Circuito em metros"));
        Duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração em minutos"));
           
        ProcedureVelMedia();
        JOptionPane.showMessageDialog(null, "Velocidade Média: " + VelMedia + "km/h");
    }
    
    static void ProcedureVelMedia()
    {
        VelMedia = ((Voltas * Circuito)/1000)/(Duracao/60);
    }
}