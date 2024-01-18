
interface BasicAnimal{
    void eat();
    void sleep();
    
}
class Monkey{
    public void jump(){
       System.out.println("The monkey keeps jumping from one branch to another");
    }
    public void bite(){
        System.out.println("The monkey bites on teasing");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Humans eat thrice a day");
    }
    public void sleep(){
        System.out.println("Human sleep 7-8 hours.");
    }
}

public class abstractClass2 {
    public static void main(String[] args) {
        Human h=new Human();
        h.bite();
        h.eat();
        h.sleep();
        h.jump();
    }
}
