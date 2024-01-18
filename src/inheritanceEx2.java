class Rectangle1{
    protected int l;
    protected int b;
    Rectangle1(int l,int b ){
        this.l=l;
        this.b=b;
    }
    public void AreaOfRect(){
        System.out.println("The area of Rectangle : "+ l*b);
    }
}

class Cuboid extends Rectangle1{
    private int h;
    Cuboid(int l,int b, int h){
        super(l, b);
        this.h=h;
    }
    public void getAreaCub(){
        System.out.println("Volume of cuboid : "+this.l*this.b*h);
    }
}

public class inheritanceEx2 {
    public static void main(String[] args) {
      Rectangle1 r1=new Rectangle1(4, 5);  
      r1.AreaOfRect();
      Cuboid cub = new Cuboid(3,5,6);
      cub.AreaOfRect();
      cub.getAreaCub();
    }
}
