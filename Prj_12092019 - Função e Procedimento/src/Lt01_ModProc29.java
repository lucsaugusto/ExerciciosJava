/*
Nome do programa: Lt01_ModProc29
Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
          Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
          Demais tipos não serão considerados.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc29{
    static Double Poupança, RendaFixa, Investimento, Tipo;
    public static void main (String args []){
        Investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Investimento"));
        Tipo = Double.parseDouble(JOptionPane.showInputDialog("Digite o Tipo de Investimento, sendo: \n1 = Poupança \n2 = Renda Fixa"));
        ProcedureInvestimento();
    }
    
    static void ProcedureInvestimento(){
        if (Tipo == 1){
            Poupança = (Investimento * 1.03 * 1);
            JOptionPane.showMessageDialog(null, "Investimento em Poupança: R$" + Poupança);
        }
        else if (Tipo == 2){
            RendaFixa = (Investimento * 1.05 * 1);
            JOptionPane.showMessageDialog(null, "Investimento em Renda Fixa: R$" + RendaFixa);
        }
        else{
            JOptionPane.showMessageDialog(null, "Tipo de Investimento Inválido");
        }
    }
}