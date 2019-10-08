/*
Nome do programa: Lt01_ModProc24
Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc24{
    static int Valor;
    public static void main (String[] args){
        Valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor"));
                 
        ProcedureVerifica();
    }
    
    static void ProcedureVerifica(){
        if (Valor % 2 == 0){
            JOptionPane.showMessageDialog(null, "NÚMERO DIVISÍVEL POR 2");
        }
        else{
            JOptionPane.showMessageDialog(null, "NÚMERO NÃO DIVISÍVEL POR 2");
        }
        if (Valor % 3 == 0){
            JOptionPane.showMessageDialog(null, "NÚMERO DIVISÍVEL POR 3");
        }
        else{
            JOptionPane.showMessageDialog(null, "NÚMERO NÃO DIVISÍVEL POR 3");
        }
        if (Valor % 2 == 0 && Valor % 3 == 0){
            JOptionPane.showMessageDialog(null, "NÚMERO DIVISÍVEL POR 2 E POR 3 AO MESMO TEMPO");
        }
        else{
            JOptionPane.showMessageDialog(null, "NÚMERO NÃO DIVISÍVEL POR 2 E POR 3 AO MESMO TEMPO");
        }
    }
}