package recursion;

public class towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
toh(n,'a','b','c');
	}

	public static void toh(int n,char from,char to,char using) {
		if(n==0) {
			return;
		}
		toh(n-1,from,using,to);
		System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
		toh(n-1,using,to,from);
	}
} 
