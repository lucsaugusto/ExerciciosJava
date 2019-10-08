/*
Nome do programa: Lt01_VetMat09
Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados 
          no programa segundo:
          1 - 4 - 16 - 64
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat09{
    public static void main (String[] args){
        int opc = 0;
        int Matriz[][] = new int[4][4];
                
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
            for (i = 0; i < 4; i++){
                for (j = 0; j < 4; j++){
                    if (i == j){
                        matriz[i][j] = (int) Math.pow(4, i);
                    }
                    else{
                        matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                    }
                }
            } 
            return matriz;
        }
        
        public static String MostraMatriz(int matriz[][]){
            int i, j;
            String Mostra = "Matriz carregada:";
            for (i = 0; i < 4; i++){
                for (j = 0; j < 4; j++){
                    Mostra += "\nMatriz[" + i + "][" + j + "] = " + matriz[i][j];
                }
            }
            return Mostra;
        }
}
