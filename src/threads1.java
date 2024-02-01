class practice extends Thread{
    public void run(){
        while (true){
            System.out.println("I am thread 1");
        }
    }
}

class practiceA extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am thread 2");
        }
    }
}


public class threads1 {
    public static void main(String[] args) {
        practice p=new practice();
        p.setPriority(7);
        practiceA p1=new practiceA();
        p1.setPriority(5);
        System.out.println(p.getPriority());
        System.out.println(p1.getPriority());
        System.out.println(p.getState());
        System.out.println(Thread.currentThread().getState());
        //p.start();
        //p1.start();
    }
}
