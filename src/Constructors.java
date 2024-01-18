class Rect{
    private int l;
    private int b;
    
    public Rect(int l, int b) {
        this.l = l;
        this.b = b;
    }
    
    
    
    public void details(){
        System.out.println("The area of rectangle is: "+ l*b);
        System.out.println("Perimeter of rectangle is: "+ 2*(l+b));
    }
}


public class Constructors {
    public static void main(String[] args) {
        Rect r=new Rect(3,4);
        r.details();

    }
}
