
package pro1p1_diegoandino;

import java.util.Random;

public class Recursive {
     Random aleatorio = new Random();
    
    int cont;  
    
    //NO ME DIO EL TIEMPO DE HACER LAS EXPLICACIONES TE AHORRO EL TIEMPO...
//------------------------------------------------------------------------------
    public int BinDec(int num){                                          
        if (num > 0) {                                    
            int expo = (int) Math.pow(2, cont);       
            int cambio = n % 10;                            
            cont++;                                    
            return cambio * expo + BinDec(num / 10);                                                        
        } else
    return 0;                                      
    }
//------------------------------------------------------------------------------
    public void resetCont(){
        this.cont = 0;
    }
//------------------------------------------------------------------------------
    public String DecBin(int num){
        if (num > 1) {
            String res = num % 2 + " ";
            return DecBin(num / 2) + res;
        } 
        else{
            if(num == 1){
                return 1 + " ";
            }else
                return 0 + " ";
            }
    }
//------------------------------------------------------------------------------
    public static int [][] llenar(int [][] mat, int fil, int col){
        Random alea = new Random();
        mat[fil][col] = alea.nextInt(10);
        if(fil == mat.length - 1 && col == mat[0].length-1){
            return mat;
        }
        else{
            if(col == mat[0].length - 1){
            
            return llenar(mat, fil + 1, 0);
            }
            else{
                return llenar(mat, fil, col + 1);
            }
            
        }
        
    }
//------------------------------------------------------------------------------
    public static String imprimir(int [][]matrix, int fil, int col, String acum){
        
        acum = acum + "[" + matrix[fil][col] + "]";
        
        if(fil == matrix.length - 1 && col == matrix[0].length - 1){
            return acum;
        }
        else{
            if(col == matrix[0].length - 1){
                acum += "\n";
                return imprimir(matrix, fil + 1, 0, acum);
            }
            else{
                return imprimir(matrix, fil, col + 1, acum);
                
            }
        }
        
    }
//------------------------------------------------------------------------------
    public static int rowProduct(int [][]matrixa, int [][]matrixb, int fil, int col, int indice, int suma){
        
        
        suma += matrixa[fil][indice] * matrixb[indice][col]; 
        if(indice == matrixa[0].length - 1){
           return suma;
        }
        else{
            return rowProduct(matrixa, matrixb, fil, col, indice + 1, suma);
        }
    }
//------------------------------------------------------------------------------
    public static int [][]multi(int [][]matrixa, int[][]matrixb, int[][]matrixc, int fil3, int col3){

        
        matrixc[fil3][col3]=rowProduct(matrixa, matrixb, fil3,col3,0,0);
        
        if(col3 == matrixc[0].length - 1 && fil3 == matrixc.length - 1){
            return matrixc;
        }
        else{
            if(col3 == matrixc[0].length - 1){
                return multi(matrixa, matrixb, matrixc, fil3 + 1,0);
                
                
            }
            else{
                return multi(matrixa, matrixb, matrixc, fil3, col3 + 1);
            }
        }
        
        
    }
    
}
