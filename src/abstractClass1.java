
abstract class Pen {
     abstract void write();
     abstract void refill();
    
}

class Fountainpen extends Pen{
    public void write(){
        System.out.println("The fountain Pen writes very smoothly");
    }
    public void refill(){
        System.out.println("The refill of fountain pen is costly");
    }
    public void changeNib(){
        System.out.println("The nib of fountain pen needs to be changed every week.");
    }
}

public class abstractClass1 {
    public static void main(String[] args) {
     Fountainpen fp = new Fountainpen();
     fp.changeNib();
     fp.write();
     fp.refill();
     Pen p=new Fountainpen();
     p.write();
     p.refill();
     
    }
}
