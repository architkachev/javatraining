package javase01.t05.logic;

public class Matrix {
    int [][] matrix;

    public Matrix(int n, int m) throws Exception {
        if((n>0)&&(m>0)){
            int [][] mat = new int [n][m];
            this.matrix = mat;
        } else {
            throw new Exception("Size of array must be positive");
        }

    }

    public int[][] getMatrix() {
        return matrix;
    }

    public static void printMatrixInConsole(int [][] matrix){
        for (int i =0; i< matrix.length; i++){
            for(int j =0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
    public void setKrestX() throws Exception {
        if(this.matrix[0].length==this.matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                this.matrix[i][i] = 1;
                this.matrix[i][this.matrix.length - i - 1] = 1;
            }
        } else {
            throw new Exception("matrix must be square.");
        }
    }

}
