/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Aula1211 {
    public static void main(String[] args) {
        int cont=0, nmr=0, result;
        nmr=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para calcular a tabuada:"));
        while(cont<=9){
            cont=cont+1;
            result=cont*nmr;
        JOptionPane.showMessageDialog(null,nmr+"x"+cont+"= "+Integer .toString(result));
        }
    }
}
