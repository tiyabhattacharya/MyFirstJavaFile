/**
 * Employee ques 1
 */
 class Employee {
     int salary;
     String name;
     public int getSalary(){
        return salary;
     }
     public String getName(){
        return name;
     }
     public String setName(String newName){
        name=newName;
        return name;
     }
    
}

// Ques 2 class square

 class Square {
      int side;
      public void setSide(int n){
        side=n;
      }
      public int getArea(){
        return side*side;
      }
      public int getPerimeter(){
        return 4*side;
      }
    
}


// Ques 3 class rectangle

 class Rectangle {
      int length;
      int breadth;
      public void setSides(int n,int m){
        length=m;
        breadth=n;
      }
      public int getArea(){
        return length*breadth;
      }
      public int getPerimeter(){
        return 2*(length+breadth);
      }
    
}



//ques 4 class circle
class Circle {
      int r;
      public void setSide(int radius){
        r=radius;
      }
      public int getArea(){
        return 22/7*r*r;
      }
      public int getCircumference(){
        return 22/7*r*2;
      }
    
}



public class CustomClass {
    public static void main(String[] args) {

        //ques1
        Employee John = new Employee();
        John.setName("Sam");
        System.out.println(John.getName());
        John.salary=1300000;
        System.out.println(John.getSalary());


        //ques 2
        Square obj= new Square();
        obj.setSide(5);
        System.out.println(obj.getPerimeter());
        System.out.println(obj.getArea());


        //ques 3
        Rectangle ob = new Rectangle();
        ob.setSides(4,6);
        System.out.println(ob.getArea());
        System.out.println(ob.getPerimeter());

        
        //ques 4
        Circle obc= new Circle();
        obc.setSide(5);
        System.out.println(obc.getCircumference());
        System.out.println(obc.getArea());
        
    }
}
