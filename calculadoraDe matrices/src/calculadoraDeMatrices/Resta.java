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
public class Resta extends ACalculadora{

    @Override
    public String calculadora(int largo, int ancho) {
        String resultado=" ";
        int[][] matriz1 = new int[largo][ancho];
        int [][] matriz2=new int[largo][ancho];
        int [][] matriz3=new int[largo][ancho];
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de la cordenada ("+i+","+j+") de la primera matriz"));
                }            
        }
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de la cordenada ("+i+","+j+") de la segunda matriz"));
                }            
        }
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz3[i][j]=matriz1[i][j]-matriz2[i][j];
                }            
        }
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                resultado+=matriz3[i][j]+" ";
            }
            resultado +="\n";
        }
        return resultado;
        
    }
    
}
