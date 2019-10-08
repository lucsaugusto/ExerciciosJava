/*
Nome do programa: Lt01_EstDec28
Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
    Venda Mensal       | Preço Atual      | Preço Novo
    < 500              | < 30             | + 10%
    >= 500 e < 1000    | >= 30 e < 80     | + 15%
    >= 1000            | >= 80            | - 5%
    Obs.: para outras condições, preço novo será igual ao preço atual.
Nome do programador: Lucas Augusto
Data de criação: 21/08/2019
 */

import javax.swing.JOptionPane;
public class Lt01_EstDec28 {
    public static void main (String[] args) {
        double VendaMensal, PrecoAtual, PrecoNovo;
        PrecoAtual = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
        VendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Qual o total de venda mensal do produto?"));
        if (VendaMensal < 500 && PrecoAtual < 30) {
            PrecoNovo = PrecoAtual * 1.10;
        }
        else if ((VendaMensal >= 500 && VendaMensal < 1000) && (PrecoAtual >=30 && PrecoAtual < 80)) {
            PrecoNovo = PrecoAtual * 1.15;
        }
        else if (VendaMensal >= 1000 && PrecoAtual >= 80) {
            PrecoNovo = PrecoAtual * 0.95;
        }
        else {
            PrecoNovo = PrecoAtual;
        }
        JOptionPane.showMessageDialog(null, "Novo preço: R$" + PrecoNovo + ".");
    }
}
