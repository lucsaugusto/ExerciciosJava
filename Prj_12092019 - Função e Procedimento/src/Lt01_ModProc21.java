/*
Nome do programa: Lt01_ModProc21
Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
    a. Se a média for >= 6,0 exibir “APROVADO”;
    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
    c. Se a média for < 3,0 exibir “RETIDO”.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc21 {
    static double N1, N2, N3, N4, Media;
        public static void main(String[] args) {
            N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N1"));
            N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N2"));
            N3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N3"));
            N4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N4"));
            CalcMedia();
            MostraResultado();
        }
        
    static void CalcMedia() {
        Media = (N1+N2+N3+N4)/4;
    }
    
    static void MostraResultado() {
        if (Media >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
        else if (Media >= 3){
            JOptionPane.showMessageDialog(null,"EXAME");
        }
        else{
            JOptionPane.showMessageDialog(null,"RETIDO");
        }
    }
}
