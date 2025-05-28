package arrays;

public class copyonearraytoanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,4,5};
int b[]=new int[a.length];
b=a;
b[0]++;
System.out.println("content in a:");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("content in b:");
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
	}
	}

}
