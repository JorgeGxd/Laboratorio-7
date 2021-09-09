/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totito;

import java.util.Arrays;

public class Helpers {
    String op;
    
    public Helpers(){
        this.op = "";
    }
    
    public boolean HorizontalLine(String letter, String[][] mat){

        for(int i = 0; i < 3; i++){
            int contador = 0;
            for(int j = 0; j < 3; j++){
                if(mat[i][j].equals(letter)){
                    contador++;
                }
            }
            if(contador == 3){return true;}
        }
        return false;
    }

    public boolean VerticalLine(String letter, String[][] mat){

        for(int i = 0; i < 3; i++){
            int contador = 0;
            for(int j = 0; j < 3; j++){
                if(mat[j][i].equals(letter)){
                    contador++;
                }
            }
            if(contador == 3){return true;}
        }
        return false;
    }
    
    public boolean CrossLine(String letter, String[][] mat){
        if(mat[0][0].equalsIgnoreCase(letter) && mat[1][1].equalsIgnoreCase(letter) && mat[2][2].equalsIgnoreCase(letter)){
            return true;
        }
        else if(mat[0][2].equalsIgnoreCase(letter) && mat[1][1].equalsIgnoreCase(letter) && mat[2][0].equalsIgnoreCase(letter)){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
