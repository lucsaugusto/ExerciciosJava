/*
Nome do programa: Lt01_VetMat12
Objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
            1 - 2 - 3 - 4 - 5 - 6 - 7
            P - T - B - C - R - R - V
          Calcular e mostrar a soma das peças do tabuleiro.
          obs: Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

//1import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class Lt01_VetMat12{
    public static void main (String[] args){
        int opc = 0;
        int Matriz[][] = new int[8][8];
                
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Matriz \n 2 - Mostrar Matriz carregada \n 9 - Fim"));
            switch (opc){
                case 1:
                    Matriz = CarregaMatriz(Matriz);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, MostraMatriz(Matriz));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    
        public static int[][] CarregaMatriz(int matriz[][]){
            int i, j;
            Random numero = new Random();
            for (i = 0; i < 8; i++){
                for (j = 0; j < 8; j++){
                    matriz[i][j] = (int)numero.nextInt(7);
                }
            }
            return matriz;
        }

        public static String MostraMatriz(int matriz[][]){
            int i, j = 0;
            int vetor[] = new int [7];
            String Mostra = "Soma das Peças:";
            for (i = 0; i < 8; i++){
                for (j = 0; j < 8; j++){
                    vetor[matriz[i][j]] = (vetor[matriz[i][j]] + 1);
                }
            }
            for (i=0; i<7; i++){
                Mostra += "\nPeça " + (i+1) + ": " + vetor[i]; 
            }
            return Mostra;
        }
}