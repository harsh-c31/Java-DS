package arrays;

public class addtwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{4,32,2},{2,3,4}};
int b[][]= {{4,3,2},{43,2,2},{45,2,1}};
int rows=a.length;
int cols=a[0].length;
	int sums[][]=new int [rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
		 sums[i][j]=a[i][j]+b[i][j];
			
	}

}
System.out.println("resultant matrix:");

for(int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
		System.out.print(sums[i][j]+" ");
	}
	System.out.println();
	}
}
}