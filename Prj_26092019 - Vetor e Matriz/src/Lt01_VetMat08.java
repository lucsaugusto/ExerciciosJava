/*
Nome do programa: Lt01_VetMat08
Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
            a.	A quantidade de cada produto vendido no mês;
            b.	A quantidade de produtos vendidos por semana;
            c.	O total de produtos vendidos no mês.
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat08{
    public static void main (String[] args){
        int opc = 0;
        int Matriz[][] = new int[4][3];
                
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Matriz \n 2 - Mostrar quantidade de cada produto vendido no mês \n 3 - Quantidade de produtos vendido por semana \n 4 - Total de produtos vendidos no mês \n 9 - Fim"));
            switch (opc){
                case 1:
                    Matriz = CarregaMatriz(Matriz);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, QtdeMesMatriz(Matriz));
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, QtdeSemanaMatriz(Matriz));
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, TotalMatriz(Matriz));
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
                for (j = 0; j < 3; j++){
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                }
            }
            return matriz;
        }
        
        public static String QtdeMesMatriz(int matriz[][]){
            int i, j, ProdMes;
            String Mostra = "Quantidades:";
            for ( i = 0 ; i < 3; i++ ){
                ProdMes = 0;
                for (j = 0; j < 4; j++){
                    ProdMes = ProdMes + matriz[j][i];
                }
                if (i == 0){
                    Mostra += "\nProduto 1: " + ProdMes;
                }
                else if (i == 1){
                    Mostra += "\nProduto2: " + ProdMes;
                }
                else if (i == 2){
                    Mostra += "\nProduto 3: " + ProdMes;
                }
            } 
            return Mostra;
        }
        
        public static String QtdeSemanaMatriz(int matriz[][]){
            int i, j, ProdSem;
            String Mostra = "Quantidades:";
            for (i = 0; i < 4; i++){
                ProdSem = 0;
                for (j = 0; j < 3; j++){
                    ProdSem = ProdSem + matriz[i][j];
                }
                if (i == 0){
                    Mostra += "\nSemana 1: " + ProdSem;
                }
                else if (i == 1){
                    Mostra += "\nSemana 2: " + ProdSem;
                }
                else if (i == 2){
                    Mostra += "\nSemana 3: " + ProdSem;
                }
                else{
                    Mostra += "\nSemana 4: " + ProdSem;
                }
            } 
            return Mostra;
        }
        
        public static int TotalMatriz(int matriz[][]){
            int i, j, Total = 0;
            for ( i = 0 ; i < 4; i++ ){
                for (j = 0; j < 3; j++){
                    Total = Total + matriz[i][j];
                }
            }
            return Total;
        }
}
