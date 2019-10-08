/*
Nome do programa: Lt01_VetMat11
Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
            11111111
            12222221
            12333321
            12344321
            12344321
            12333321
            12222221
            11111111
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat11{
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
            int i, j, n;
            for (n = 1; n <= 4; n++){
                for (i = n; i <= (9-n); i++){
                    for (j = n; j <= (9-n); j++){
                        matriz[i-1][j-1] = n;
                    }
                }
            }
            return matriz;   
        }

        public static String MostraMatriz(int matriz[][]){
            int i, j;
            String Mostra = "Matriz carregada:";
            for (i = 0; i < 8; i++){
                for (j = 0; j < 8; j++){
                    Mostra += "\nMatriz[" + i + "][" + j + "] = " + matriz[i][j];
                }
            }
            return Mostra;
        }
}
