class Main {
    public static void main(String[] args) {
int num=1241,rev=0,rem,temp;
if(pal(num,rev)==num){
    System.out.println("Palindrome");
}
else{
    System.out.println("Not palindrome");
}
    }
static int pal(int num,int rev){
    if(num==0){
        return rev;
    }
    int rem=num%10;
    rev=rev*10+rem;
    return pal(num/10,rev);
}    
}
