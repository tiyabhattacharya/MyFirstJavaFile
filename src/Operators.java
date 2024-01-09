import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //ques1
        float a=7/4*9/2;
        System.out.println(a);

        //ques2
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);

        //ques 3
        int n=25;
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(n>m){
            System.out.println("My number is greater.");
        }else if(m>n){
            System.out.println("Your is greater");
        }else{
            System.out.println("Ther are equal");
        }
        sc.close();
        //ques 4
        //(v*v-u*u)/4*v*u

        //ques5
        
    }
}
