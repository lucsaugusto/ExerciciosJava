/*
Nome do programa: Lt01_VetMat04
Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
            a.	A média do grupo;
            b.	A quantidade de notas acima do grupo;
            c.	As posições dos valores abaixo da média do grupo.
Nome do programador: Lucas Augusto
Data da criação: 29/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat04{
    public static void main (String[] args){
        int opc = 0, media = 0;
        int vetor[] = new int[30];
                
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Media do Grupo \n 3 - Quantidade de Notas acima da media \n 4 - Posições abaixo da media do grupo \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor = CarregaVetor(vetor);
                break;
                case 2:
                    media = MediaVetor(vetor);
                    JOptionPane.showMessageDialog(null,"Media: " + MediaVetor(vetor));
                break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Quantidade acima da media: " + QuantidadeVetor(vetor, media)); 
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, PosiçõesVetor(vetor, media));
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
            for (valor = 0; valor < 30; valor++){
                vt[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt;
        }
        
        public static int MediaVetor(int vt[])
        {
            int i, Soma = 0, Media;
            for (i = 0; i < 30; i++){
                Soma = Soma + vt[i];
            }
            Media = Soma / i;
            return Media;
        }
        
        public static int QuantidadeVetor(int vt[], int Media){
            int i, Qtde = 0;
            for (i=0; i<30; i++){
                if(vt[i] > Media){
                    Qtde += 1;
                }
            }
            return Qtde;
        }
        
        public static String PosiçõesVetor(int vt[], int Media){
            int i=0;
            String Mostra = "Posições abaixo do grupo: ";
            for (i=0; i<30; i++){
                if(vt[i] < Media){
                Mostra += ("\nVet[" + i + "] = " + vt[i]);;
                }
            }
           return Mostra;
        }
}