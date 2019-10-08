/*
Nome do programa: Lt01_EstDec27
Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
    Calcule e mostre a velocidade média em km/h.
Nome do programador: Lucas Augusto
Data de criação: 21/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstDec27 {
    public static void main (String[] args) {
        double Voltas, Metros, Minutos, VelMedia;
        Voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de voltas:"));
        Metros = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do circuito(metros):"));
        Minutos = Double.parseDouble(JOptionPane.showInputDialog("Digite a duração da prova(minutos):"));
        Metros = (Metros * Voltas) / 1000;
        Minutos = Minutos / 60;
        VelMedia = Metros / Minutos;
        JOptionPane.showMessageDialog(null, VelMedia + " km/h.");
    }
}
