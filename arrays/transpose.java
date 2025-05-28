package arrays;

public class transpose {

	  static final int M = 3;
	    static final int N = 3;

	    static void transp(int A[][], int B[][]) {
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[0].length; j++) {
	                B[j][i] = A[i][j];
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int A[][] = {{2, 3, 4}, {5, 2, 4}, {6, 2, 8}};
	        int B[][] = new int[N][M];

	        transp(A, B);

	        System.out.println("Resultant Transposed Matrix:");
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                System.out.print(B[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}