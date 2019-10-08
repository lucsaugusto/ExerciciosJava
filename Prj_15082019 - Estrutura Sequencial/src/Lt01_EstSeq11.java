/*
Nome do programa: Lt01_EstSeq11
Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
Nome do programador: Lucas Augusto
Data da criação: 17/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstSeq11
{
    public static void main(String[] args)
    {
        double Raio, Circunferencia;
        Raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:"));
        Circunferencia = 2 * Raio * 3.14;
        JOptionPane.showMessageDialog(null,"Comprimento da Circunferência: "+Circunferencia);
    }
}

