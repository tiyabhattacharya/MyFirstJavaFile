class Rect{
    private int l;
    private int b;
    public Rect(int length,int breadth){
         l=length;
         b=breadth;
    }
    public void details(){
        System.out.println("The area of rectangle is: "+ l*b);
        System.out.println("Perimeter of rectangle is: "+ 2*(l+b));
    }
}


public class Constructors {
    public static void main(String[] args) {
        Rect r=new Rect(6,4);
        r.details();

    }
}
