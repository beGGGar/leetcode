/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class RotateImage {
    
    public RotateImage(){
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};//{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(matrix);
        rotate(matrix);
        
        print(matrix);
        
        
    }
    
    
    public void matrixTransp(int[][] matrix){       
        for (int i = 0; i<matrix.length; i++){
            for (int j = i+1; j<matrix.length; j++){
                int buff = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buff;
            }
        }
    }
    
    public void matrixVerticalMirror(int[][] matrix){
        int buff;
        int size = matrix.length-1;
        for (int[] submatrix : matrix) {
            for (int j = 0; j<(int)(matrix.length/2); j++){
                buff = submatrix[j];
                submatrix[j] = submatrix[size-j];
                submatrix[size-j] = buff;
            }
        }
    }
    
    public void print(int[][] matrix){
        for (int[] submatrix : matrix) {
            for (int item : submatrix) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void rotate(int[][] matrix) {
        matrixTransp(matrix);
        matrixVerticalMirror(matrix);
    }

}
