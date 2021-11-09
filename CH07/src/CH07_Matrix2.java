
public class CH07_Matrix2 {

	public static void main(String[] args) {
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		
		CH07_Matrix2.makeMatrix2(A);
		CH07_Matrix.makeMatrix(B);
		
		System.out.println("\nMatrix A is ..");
		CH07_Matrix.printMatrix(A);
		System.out.println("\nMatrix B is ..");
		CH07_Matrix.printMatrix(B);
		
		CH07_Matrix2.addition(A,B);
		CH07_Matrix2.subtraction(A,B);
		CH07_Matrix2.multiplication(A,B);

	}
	public static void makeMatrix2(int [][] Matrix) {
		int num = 1;
		for(int i=0; i<Matrix.length; i++) {
			for(int j=0; j<Matrix[i].length; j++) {
				Matrix[i][j] = num++;
			}
		}
	}
	
	public static void addition(int [][] A, int [][] B) {
		System.out.println("\nMatrix addition is ..");
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j]+B[i][j] +" ");
			}
			System.out.print("\n");
		}
	}
	public static void subtraction(int [][] A, int [][] B) {
		System.out.println("\nMatrix subtraction is ..");
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j]-B[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static void multiplication(int [][] A, int [][] B) {
		System.out.println("\nMatrix multiplication is ..");
		
		for(int i=0; i<A.length; i++) {
			for(int m=0; m<B[i].length; m++) {
				int result = 0;
				for(int j=0; j<A[i].length; j++) {
					result += A[i][j]*B[j][m];
					}
				System.out.print(result+" ");
			}
			System.out.print("\n");
		}
		
	}

}
