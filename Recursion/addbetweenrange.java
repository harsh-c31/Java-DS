package recursion;

public class addbetweenrange {
public static void main(String[] args) {
	System.out.println(sum(4,10));
	}
	public static int sum(int start,int end) {
		if(end>start) {
			return end+sum(start,end-1);
			}
		else {
			return 0;
		}
	}
	

}
