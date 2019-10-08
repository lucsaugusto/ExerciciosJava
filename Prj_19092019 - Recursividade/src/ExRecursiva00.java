/*
Nome do programa: ExRecursiva00
Objetivo: Calcular o Fatorial de um número, usando recursividade.
Nome do programador: Lucas Augusto
Data da criação: 19/09/2019
*/

import javax.swing.JOptionPane;
public class ExRecursiva00 {
    public static void main (String[] args){
        int Num, Fatorial;
        Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        Fatorial = FFat(Num);
        JOptionPane.showMessageDialog(null, "Fatorial de " + Num + " é igual a " + Fatorial);
    }
    
    static int FFat(int N){
        int Fat;
        if (N == 1) {
            return 1;
        }
        else {
            Fat = N*FFat(N-1);
            return Fat;
        }
    }
}
