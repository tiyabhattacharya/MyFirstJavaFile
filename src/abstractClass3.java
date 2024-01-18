abstract class Telephone{
    private int pn;
    Telephone(int pn){
        this.pn=pn;
    }
    abstract void ring(int p);
    abstract void lift();
    abstract void disconnect(int p);
}

class Smartphone extends Telephone{
    private int pno;
    Smartphone(int pno){
        super(pno);
        this.pno=pno;
    }
    public void ring (int pno){
        System.out.println("Ringing :"+pno);
    }
    public void lift(){
        System.out.println("Lifting the call");
    }
    public void disconnect(int pno){
        System.out.println("Disconnecting :"+pno);
    }
}

public class abstractClass3 {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone(78897839);
        sp.ring(5674893);
        sp.lift();
        sp.disconnect(56789);
        Telephone tpe=new Smartphone(456848);
        tpe.ring(34566);
        tpe.lift();
        tpe.disconnect(3456);
    }
}

