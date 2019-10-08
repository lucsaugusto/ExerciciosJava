/*
Nome do programa: Lt01_ModFunc44
Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Nome do programador: Lucas Augusto
Data da criação: 29/08/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModFunc44{
    public static void main (String[] args){
        int Base, Expoente;
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        Expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));
        JOptionPane.showMessageDialog(null, "Potência de " + Base + " elevado a " + Expoente + "\nResultado: " + FuncaoPotencia(Base, Expoente));
    }
    
    static int FuncaoPotencia(int B, int E){
        int Resultado = 1, Count;
        for (Count = 1; Count <= E; Count++){
            Resultado = Resultado * B;
        }
        return Resultado;
    }
}