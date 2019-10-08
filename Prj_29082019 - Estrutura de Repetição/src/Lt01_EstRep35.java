/*
Nome do programa: Lt01_EstDec35
Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
    Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Nome do programador: Lucas Augusto
Data de criação: 29/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstRep35 {
    public static void  main (String[] args) {
        int N1, N2, Aux, Somatoria = 0;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número:"));
        if (N1 > N2) {
            Aux = N1;
            N1 = N2;
            N2 = Aux;
        }
        Aux = N1 + 1;
        while (Aux < N2){
           if (Aux % 2 != 0) {
               Somatoria = Somatoria + Aux;
           }
           Aux++;
        }
        JOptionPane.showMessageDialog(null, "A somatória é: " + Somatoria);
    }
}
