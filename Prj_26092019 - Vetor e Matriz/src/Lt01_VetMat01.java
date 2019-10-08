/*
Nome do programa: Lt01_VetMat01
Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
            a.	A média dos valores entre 10 e 200;
            b.	A soma dos números ímpares.
Nome do programador: Lucas Augusto
Data da criação: 26/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat01{
    public static void main (String[] args){
        int opc = 0;
        int vetor[] = new int[50];
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Media dos Valores entre 10 e 200 \n 3 - Soma dos numeros Impares \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor = CarregaVetor(vetor);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Media: " + MediaVetor(vetor));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Soma Impares: " + ImparesVetor(vetor));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    
        public static int[] CarregaVetor(int vt[ ]){
            int valor;
            for ( valor = 0 ; valor < 50 ; valor++ ){
                vt[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt;
        }
        
        public static int MediaVetor(int vt[]){
            int i, Soma = 0, Media;
            for (i = 0; i < 50; i++){
                if(vt[i] > 10 && vt[i] < 200){
                    Soma = Soma + vt[i];
                }
            }
            Media = Soma / i;
            return Media;
        }
        
        public static int ImparesVetor(int vt[]){
        int SomaImp = 0, i = 0;
                
        while (i < 50){
            if (vt[i] % 2 != 0){
                SomaImp = SomaImp + vt[i];
            }
            i = i + 1;
        }
        return SomaImp;
        }
    }