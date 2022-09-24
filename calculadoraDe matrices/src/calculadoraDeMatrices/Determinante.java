/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraDeMatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Nesema
 */
public class Determinante extends ACalculadora{

    @Override
    public String calculadora(int largo, int ancho) {
        String resultado="la determinate es: ";
        int[][] matriz1 = new int[largo][ancho];
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de la cordenada ("+i+","+j+") de la primera matriz"));
                }            
        }
        resultado+= determinanteMatriz(matriz1, largo);
        
        return resultado;
    }
    
        static void obtenerCofactor(int matriz1[][],int temp[][],int p,int q,int largo){
            int i=0;
            int j=0;
            for(int fila=0;fila<largo;fila++ ){
                for(int columna=0;columna<largo;columna++ ){
                    if(fila!=p&&columna!=q){
                        temp[i][j++]=matriz1[fila][columna];
                        if(j==largo-1){
                        j=0;
                        i++;
                        }
                    }
                }
            }
        }//termina cofactor
        static int determinanteMatriz(int matriz1[][],int largo){
            int determinante=0;
            if(largo==1){
                return matriz1[0][0];
            }
            int temp[][]= new int[largo][largo];
            int multiplicador=1;
            for(int f=0;f<largo;f++){
                obtenerCofactor(matriz1, temp, 0, f, largo);
                determinante+= multiplicador*matriz1[0][f]+determinanteMatriz(temp, largo-1);
                multiplicador=-multiplicador;
            }
        return determinante;
        }
            
    
}
