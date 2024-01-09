import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        //ques1
        String name="TIYA";
        System.out.println(name.toLowerCase());

        //ques2
        String spaces="This is a nice place";
        System.out.println(spaces.replace(" ", "_"));

        //ques3
        
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        System.out.println("Dear"+" "+name1+" "+"Thank,alot!");
        sc.close();

        //ques4
        String dt="This is my string   with double  and triple   spaces";
        System.out.println(dt.indexOf("  "));
        System.out.println(dt.indexOf("   "));

        //ques5
        System.out.println("Dear \n\t Thank you for accepting my apology. \n Yours sincerely");
    }
}
