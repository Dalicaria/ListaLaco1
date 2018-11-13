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
public class exercicio {
    public static void main(String[] args) {
        double votos=0, chapaA=0, chapaB=0;
        while(votos!=-1){
            votos=Double.parseDouble(JOptionPane.showInputDialog("Vote 1 para chapaA ou 2 para chapaB:"));
            if((votos==1)){
                chapaA = chapaA+1;
            }
            if((votos==2)){
                chapaB= chapaB+1;
            }
        }
            if((chapaA>chapaB)){
                JOptionPane.showMessageDialog(null,"A chapaA venceu com:"+Double.toString(chapaA)+" votos.");
            }
            else if((chapaB>chapaA)){
                JOptionPane.showMessageDialog(null,"A chapaB venceu com:"+Double.toString(chapaB)+" votos.");
            }
            else {
                JOptionPane.showMessageDialog(null,"Houve empate entre as chapas:"+Double.toString(chapaB)); 
            }
        }
    }

