class Main {
    public static void main(String[] args) {
        int number=121, reverse=0,temp,rem;
        temp=number;
        while(temp!=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10; 
        }
        if(number==reverse){
            System.out.println("palindome");
        }
        else{
            System.out.println("not prime");
        }
        }
    }
