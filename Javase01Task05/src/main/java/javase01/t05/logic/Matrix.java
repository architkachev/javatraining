package javase01.t05.logic;

public class Matrix {
    int [][] matrix;

    public Matrix(int n, int m) {
            int [][] mat = new int [n][m];
            this.matrix = mat;
    }

    public void printMatrix(){
        for (int i =0; i< this.matrix.length; i++){
            for(int j =0; j< this.matrix[0].length; j++){
                System.out.print(this.matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
    public void setKrestX(){
        if(this.matrix[0].length==this.matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                this.matrix[i][i] = 1;
                this.matrix[i][this.matrix.length - i - 1] = 1;
            }
        }
    }

}
