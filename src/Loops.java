import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {
        //ques1
       /*  int n=5;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
            System.out.println("*");
        }
        System.out.println("\n");
    }*/

    //ques2
    //even=2n
    //odd = 2n+1
    System.out.println("Enter n");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
         sum=sum+n;
         n--;

    }
    System.out.println(sum);

    //ques3
    System.out.println("enter any number");
    int num=sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(num+"x"+i+"="+num*i);
    }

    //ques 4: factorial
    System.out.println("enter any number");
    int num1=sc.nextInt();
    int fact=1;
    for (int i=1;i<=num1;i++){
         fact=fact*i;
    }
    System.out.println(fact);

}
}
