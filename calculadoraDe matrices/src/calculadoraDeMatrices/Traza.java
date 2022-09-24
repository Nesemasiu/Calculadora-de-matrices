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
public class Traza extends ACalculadora{

    @Override
    public String calculadora(int largo, int ancho) {
        String resultado="La traza es: ";
        int traza=0;
        int[][] matriz1 = new int[largo][ancho];
        
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de la cordenada ("+i+","+j+") de la primera matriz"));
                if(i==j)
                {
                    traza=matriz1[i][j]+traza;
                }
                }            
        }
        resultado +=traza;
        return resultado;
    }
    
}
