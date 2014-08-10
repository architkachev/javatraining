package javase01.t05.logic;

public class Matrix {
    int [][] matrix;

    public Matrix(int n, int m) throws Exception {
        if((n>0)&&(m>0)){
            this.matrix = new int [n][m];
        } else {
            throw new Exception("Size of array must be positive");
        }

    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getElement(int i, int j){
        return this.matrix[i][j];
    }

    public int getHeight(){
        return this.matrix.length;
    }
    public int getWidth(){
        return this.matrix[0].length;
    }

    public void setCrossX() throws Exception {
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
