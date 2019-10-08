/*
Nome do programa: Lt01_VetMat06
Objetivo: Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat06{
    public static void main (String[] args){
        int opc = 0;
        int vetor[] = new int[20];
                
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Ordenar Vetor \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor = CarregaVetor(vetor);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, OrdenaVetor(vetor));
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
            for (valor = 0; valor < 20; valor++){
                vt[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt;
        }
        
        public static String OrdenaVetor(int vt[]){
            int i, Aux = 0, j = 0;
            String Mostra = "Vetor Ordenado: ";
            for (i = 0; i < 20; i++){
                for (j = i+1; j < 21; j++){
                    if ((vt[i] > vt[j])) 
                    {
                        Aux = vt[i];
                        vt[i] = vt[j];
                        vt[j] = Aux; 
                    }
                }   
            }
            for (i = 0; i < 20; i++){
                Mostra += ("\nVetor[" + i + "] = " +vt[i]);
            }
            return Mostra;
        }
}