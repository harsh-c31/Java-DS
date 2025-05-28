package arrays;

public class normalandtrace {
	 // Method to compute the normal of a matrix
    static int normal(int matrix[][], int n) {
        int sumOfSquares = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfSquares += matrix[i][j] * matrix[i][j];
            }
        }
        return (int) Math.sqrt(sumOfSquares);
    }

    // Method to compute the trace of a matrix
    static int trace(int matrix[][], int n) {
        int traceSum = 0;
        for (int i = 0; i < n; i++) {
            traceSum += matrix[i][i];
        }
        return traceSum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{2, 3, 34}, {34, 56, 2}, {76, 4, 3}};
        
        int normalValue = normal(matrix, 3);
        int traceValue = trace(matrix, 3);
        
        System.out.println("Normal of the matrix: " + normalValue);
        System.out.println("Trace of the matrix: " + traceValue);
    }
}
