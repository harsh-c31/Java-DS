package practicearrays;

public class transpose {
	int a[][]= {{1,2,3},{3,6,4}};
	
	int rows=a.length;
	int cols=a[0].length;
	int transpose[][]=new int[cols][rows];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			transpose[j][i]=a[i][j];
		}
	}
	System.out.println("transpose matrix");
	for(int i=0;i<cols;i++) {
		for(int j=0;j<rows;j++) {
			System.out.print(transpose[i][j]+" ");
		}
		System.out.println();
	}
		}

	}
