/*
Nome do programa: Lt01_VetMat02
Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
            a.	O maior e o menor valor;
            b.	A média dos valores.
Nome do programador: Lucas Augusto
Data da criação: 28/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat02{
    public static void main (String[] args){
        int opc = 0;
        int vetor[] = new int[100];
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Media dos Valores \n 3 - Maior e Menor valor \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor = CarregaVetor(vetor);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Media: " + MediaVetor(vetor));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, MaiorMenorVetor(vetor));
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
            for ( valor = 0 ; valor < 100 ; valor++ ){
                vt[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt;
        }
        
        public static int MediaVetor(int vt[]){
            int i, Soma = 0, Media;
            for (i = 0; i < 100; i++){
                Soma = Soma + vt[i];
            }
            Media = Soma / i;
            return Media;
        }
        
        public static String MaiorMenorVetor(int vt[]){
        int i = 0, Maior, Menor;
        String Mostra = "Maior: ";
        Maior = vt[0];
        Menor = vt[0];
        while (i < 100){
            if (vt[i] >= Maior){
                Maior = vt[i];
            }
            else{
                if (vt[i] <= Menor){
                    Menor = vt[i];
                }
            }
            i = i + 1;
        }
        Mostra += (Maior + "\nMenor: " + Menor);
        return Mostra;
        }
    }