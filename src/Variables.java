import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        
        //ques1
        int a=70;
        int b=30;
        int c=23;
        int sum=a+b+c;
        System.out.println(sum);

        //ques2
        float m1=68;
        float m2=68;
        float m3=68;
        float cgpa=(m1+m2+m3)/30;
        System.out.println(cgpa);

        //ques3
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("hello"+" "+name);
        

        //ques 4
        System.out.println("Give the distance in km");
        float km=sc.nextFloat();
        float miles=0.62f*km;
        System.out.println(miles);

        //ques5
        System.out.println("Enter a number");
        int ab=sc.nextInt();
        if(ab==(int)ab){
            System.out.println("It is an integer");
        }
        else{
            System.out.println("Not an integer");
        }
        sc.close();


    }
}
