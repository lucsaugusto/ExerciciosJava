/*
Nome do programa: Lt01_ModFunc32
Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
Nome do programador: Lucas Augusto
Data da criação: 28/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc32{
    public static void main (String[] args){
        int Fatorial, Numero;
        Fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser calculado"));
        Numero = Fatorial;
        
        JOptionPane.showMessageDialog(null, "FATORIAL: " + FuncaoFatorial(Fatorial, Numero));
    }
    
    static int FuncaoFatorial(int Fat, int Num){
        while (Num > 1){
            Fat = (Fat * (Num - 1));
            Num = (Num - 1);
        }
        return Fat;
    }
}
