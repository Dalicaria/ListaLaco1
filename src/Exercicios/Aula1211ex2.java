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
public class Aula1211ex2 {
    public static void main(String[] args) {
       int idade=0, cont=1, cont1=0, cont2=0;
       while(cont<=10){
            idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
            cont=cont+1;
            
            if(idade<=18){
                cont1=cont1+1;//contador para pessoas que tem idade maior que 18 anos
            }else{
               cont2=cont2+1;//contador para pessoas que tem idade menor que 18 anos
            }
      
       }
       JOptionPane.showMessageDialog(null,"pessoas menores de 18 é "+cont1);
    }
}
