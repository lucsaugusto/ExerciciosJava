/*
Nome do programa: Lt01_ModProc28
Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
          Venda Mensal          Preço Atual     PreçoNovo
            < 500                   < 30            +10%
            >= 500 e < 1000     >= 30 e < 80        +15%
            >= 1000                 >= 80           -5%
          Obs.: para outras condições, preço novo será igual ao preço atual.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc28{
    static Double PrecoAtual, MediaMensal, NovoPreco;
    public static void main (String[] args){
        PrecoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço Atual"));
        MediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a Média Mensal"));
        ProcedureNovoPreco();
        JOptionPane.showMessageDialog(null, "Preço Atual: R$" + NovoPreco);
    }
    
    static void ProcedureNovoPreco(){
        if (PrecoAtual < 500 && MediaMensal < 30){
            NovoPreco = (PrecoAtual * 1.10);
        }
        else if (PrecoAtual < 1000 && MediaMensal < 80){
            NovoPreco = (PrecoAtual * 1.15);
        }
        else{
            NovoPreco = (PrecoAtual * 0.95);
        }
    }
}