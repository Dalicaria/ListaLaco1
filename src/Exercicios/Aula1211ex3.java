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
public class Aula1211ex3 {
    public static void main(String[] args) {
        int nmr1=0, nmr2=0, conta = 0, result = 0;
        while(conta!=5){
           nmr1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número:")); 
           nmr2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número:"));
           conta=Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n1-Soma\n2-Subtração\n-3Multiplicação\n4-Divisão\n5-Sair"));
           if(conta==1){
              result=nmr1+nmr2;
           }
           if(conta==2){
              result=nmr1-nmr2;
           }
           if(conta==3){
              result=nmr1*nmr2;
           }
           if(conta==4){
              result=nmr1/nmr2;
           }
        }
        JOptionPane.showMessageDialog(null,"O resultado é:"+Integer.toString(result));
    }
}
