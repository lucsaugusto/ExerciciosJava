/*
Nome do programa: Lt01_EstRec04
Objetivo: Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)
Nome do programador: Lucas Augusto
Data da criação: 19/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRec04
{
    public static void main (String args [])
    {
        double Num;
        Num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NÚMERO A SER CALCULADO"));
        JOptionPane.showMessageDialog(null, "Série = " + FSerie(Num));
    }
    
    static double FSerie(double N)
    {
        return FSerie4(N, 1);
    }
    
    static double FSerie4(double N, double Aux)
    {
        double Serie4;
        if (N >= 1)
        {
            Serie4 = (N/Aux + FSerie4(N-1, Aux+1));
            return Serie4;
        }
        else
        {
            return N;
        }
    }
}