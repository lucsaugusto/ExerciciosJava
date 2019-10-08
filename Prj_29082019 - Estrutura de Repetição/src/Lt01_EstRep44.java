/*
Nome do programa: Lt01_EstRep44
Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_EstRep44 {
    public static void main (String[] args) {
        int Base, Expoente, Resultado = 1, Cont;
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        Expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));
        for (Cont = 1; Cont <= Expoente; Cont++) {
            Resultado = Resultado * Base;
        }
        JOptionPane.showMessageDialog(null, Base + " elevado por " + Expoente + "\nResultado: " + Resultado);
    }
}
