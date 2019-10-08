/*
Nome do programa: Lt01_VetMat05
Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
            10
            ∑ (A[1] – A[21–1])
            i = 1
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat05{
    public static void main (String[] args){
        int opc = 0;
        int vetor[] = new int[20];
                
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Calcula Soma dos Termos \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor = CarregaVetor(vetor);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Soma: " + SomaVetor(vetor));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    
        public static int[] CarregaVetor(int vt[]){
            int valor;
            for (valor = 0; valor <= 19; valor++){
                vt[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt;
        }
        
        public static int SomaVetor(int vt[]){
            int i, Soma = 0;
            for (i = 1; i <= 20/2; i++){
                Soma = Soma + (vt[i - 1] - (vt[20 - i]));
            }
            return Soma;
        }
}