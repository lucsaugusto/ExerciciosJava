/*
Nome do programa: ExemploEscolha
Objetivo: 
Nome do programador: Lucas Augusto
Data de criação: 29/08/2019
 */
import javax.swing.JOptionPane;
public class ExemploEscolha {
    public static void main (String[] args) {
        int Opc;
        Opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:"));
        switch (Opc) {
            case 1: case 2: case 3:
                System.out.println("Sábado");
                break;
            case 10:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
