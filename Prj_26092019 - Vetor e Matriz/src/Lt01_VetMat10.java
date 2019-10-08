/*
Nome do programa: Lt01_VetMat10
Objetivo: Criar uma matriz [8][8] onde o programa irá carregar segundo:
            casa: 1 - 2 - 3 - 4
            valor: 1 - 2 - 4 - 8
          obs: exibir a soma dos valores
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat10{
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
            int i, j, SomaL = 0;
            for (i = 0; i < 8; i++){
                for (j = 0; j < 8; j++){
                    if (j == 0){
                        if (i == 0){
                            matriz[i][j] = 1;
                            SomaL = (SomaL + matriz[i][j]);
                        }
                        else{
                            matriz[i][j] = (matriz[i-1][7] * 2);
                            SomaL = (SomaL + matriz[i][j]);
                        }
                    }
                    else{
                        matriz[i][j] = (matriz[i][j-1] * 2);
                        SomaL = (SomaL + matriz[i][j]);
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
