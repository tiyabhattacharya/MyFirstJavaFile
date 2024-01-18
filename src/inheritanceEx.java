class Circle1{
    protected int r;
    Circle1(int r){
        this.r=r;
    }
    public void printArea(){
        System.out.println("Area of circle is : "+ Math.PI*r*r);
    }
}
 class Cylinder1 extends Circle1{
    private int h;
    Cylinder1(int r, int h){
        super(r);
        this.h=h;
    }
    public void printVolume(){
        System.out.println("Volume of Cylinder is:" + Math.PI*r*r*h);
    }
 }

public class inheritanceEx {
    public static void main(String[] args) {
        Circle1 c=new Circle1(2);
        c.printArea();
        Cylinder1 cy=new Cylinder1(3,4 );
        cy.printVolume();
        cy.printArea(); //since cylinder1 extended circle1 hence printArea() func can be accessed by it's obj
        Circle1 c1=new Cylinder1(3, 5);  //reference of circle1 and obj of cylinder1
        c1.printArea(); 
    }
}
