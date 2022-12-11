
package pro1p1_diegoandino;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class Recursión extends javax.swing.JFrame {

    /** Creates new form Recursión */
    public Recursión() {
        setVisible(true);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Binario a decimal ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Decimal a binario ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Menu de recurción");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Converciones ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(45, 45, 45)
                .addComponent(jButton2)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BINARIO A DECIMAL
        String Bi = JOptionPane.showInputDialog(null,"Ingrese un binario:"); 
        int binario = Integer.parseInt(Bi);
        int length=(Bi.length() - 1);
        while(binario < 0){
            binario = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese binario positivo: "));
        }
        
        JOptionPane.showMessageDialog(this, "El numero binario "+ binario +" en decimal es: " + BinDec(binario));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //DECIMAL A BINARIO
        String De = JOptionPane.showInputDialog(this,"Ingrese un decimal:");
        int decimal=Integer.parseInt(De);
        
        JOptionPane.showMessageDialog(this,"El numero decimal " + decimal + " a binario es: " + DecBin(decimal));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //MENU DE RECURCION
        int fil1 = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese filas de la primera matriz: "));
        int col1 = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese columnas de la primera matriz: "));
        int fil2 = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese filas de la segunda matriz: "));
        int col2 = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese columnas de la segunda matriz: "));
        if (col1 != fil2) {
            JOptionPane.showMessageDialog(this, "El numero de columa y Filas entre la primera y segunda deberian ser iguales: ");
        } 
        else {
            int[][] matrix1 = new int[fil1][col1];
            int[][] matrix2 = new int[fil2][col2];  
            matrix1 = llenar(matrix1, 0,0);
            matrix2 = llenar(matrix2, 0,0);
            int[][]matrix3 = new int[fil1][col2];
            JOptionPane.showMessageDialog(this, "Matriz 1 es: \n"
                    + imprimir(matrix1,0,0,"") + "\n"
                    + "Matriz 2 es: \n"
                    + imprimir(matrix2,0,0,"")+"\n"
                    + "La multiplicacion es: \n"
                    + imprimir(multi(matrix1,matrix2,matrix3,0,0),0,0,"")
                                     );
            
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    Random aleatorio = new Random();
    
    int cont;   
//------------------------------------------------------------------------------
    public int BinDec(int n){                                          
        if (n > 0) {                                    
            int e = (int) Math.pow(2, cont);       
            int i = n % 10;                            
            cont++;                                    
            return i * e + BinDec(n / 10);                                                        
        } else
    return 0;                                      
    }
//------------------------------------------------------------------------------
    public void resetCont(){
        this.cont = 0;
    }
//------------------------------------------------------------------------------
    public String DecBin(int n){
        if (n > 1) {
            String res = n % 2 + " ";
            return DecBin(n / 2) + res;
        } 
        else{
            if(n == 1){
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


