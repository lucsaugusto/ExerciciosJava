/*
Nome do programa: Lt01_VetMat03
Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 
          3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
        VT1|1|2|3|	|VT2|4|5|6|	|VT3|1|2|3|4|5|6
Nome do programador: Lucas Augusto
Data da criação: 29/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat03{
    public static void main (String[] args){
        int opc = 0;
        int vetor1[] = new int[3];
        int vetor2[] = new int[3];
        
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor1 \n 2 - Carrega Vetor2 \n 3 - Concatena Vetor3 \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor1 = CarregaVetor1(vetor1);
                break;
                case 2:
                    vetor2 = CarregaVetor2(vetor2);
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, ConcatenaVetor3(vetor1, vetor2));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    
        public static int[] CarregaVetor1(int vt1[]){
            int valor;
            for (valor = 0; valor < 3; valor++){
                vt1[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt1;
        }
        
        public static int[] CarregaVetor2(int vt2[]){
            int valor;
            for (valor = 0; valor < 3; valor++){
                vt2[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt2;
        }
        
        public static String ConcatenaVetor3(int vt1[], int vt2[]){
        int i = 0, j = 3;
        int vetor3[] = new int[6];
        String Mostra = "Vetor3 Concatenado:";
        
        while (i < 3){
            vetor3[i] = vt1[i]; 
            vetor3[j] = vt2[i];
            i = i + 1;
            j = j + 1;
        }
        for (i = 0; i < 6; i++){
            Mostra += ("\nVet3[" + i + "] = " +vetor3[i]);
        }
        return Mostra;
        }
}