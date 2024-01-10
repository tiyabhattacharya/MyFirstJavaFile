
class Cylinder{
    private int radius;
    private int height;
    public void setRadius(int r){
         radius=r;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        c.setRadius(5);
        System.out.println(c.getRadius());
        c.setHeight(12);
        System.out.println(c.getHeight());
    }
}
