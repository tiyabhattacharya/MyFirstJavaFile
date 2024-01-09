import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //ques1
        float m1=78;
        float m2=89;
        float m3=89;
        float avg=(m1+m2+m3)/30f;
        if((m1/10f>3.3)&&(m2/10f>3.3)&&(m3/10f>3.3)&&(avg>4)){
               System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        //ques2
        System.out.println("enter you income in lacs(eg: 2.5)");
        Scanner sc=new Scanner(System.in);
        float i=sc.nextInt();
        System.out.println("Income is "+i);
        float tax=0;
        if(i<2.5){
            tax=tax+0;
            System.out.println("Tax: "+ tax);
        }
        else if(i>=2.5 && i<5){
            
            tax=5f/100f*(i-2.5f);
            System.out.println("Tax: "+ tax);

        }
        else if(i>=5 && i<10){
            tax=5f/100f*(i-2.5f)+20f/100f*(i-2.5f-5f);
            System.out.println("Tax: "+ tax);
        } 
        else{
           tax=5f/100f*(i-2.5f)+20f/100f*(i-2.5f-5f)+30f/100f*(i-2.5f-5f-10f);
            System.out.println("Tax: "+ tax); 
        }
        

        //ques3
        System.out.println("Enter number from 1-7");
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("enter a valid number");
                break;
        }

        //ques 4
        System.out.println("enter a year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }

        //ques 5
        System.out.println("Enter the organization name");
        String org=sc.nextLine();
        if(org.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(org.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(org.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("indeterminate");
        }

        sc.close();


    }
}
