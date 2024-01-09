public class Methods {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }

    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //sum(n)=1+2+3.....(n-1)+n
     //     =sum(n-1)+n
    static int sumRec(int n){
        //base comdition
        if(n==1){
            return 1;
        }
        else{
           return  n + sumRec(n-1);
        }
    }


    static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){
          if(n==1){
            return 0;
          }
          else if(n==2){
            return 1;
          }
          else{
            return fib(n-1) + fib(n-2);
          }
    }

    public static void main(String[] args) {
        //ques1
        multiplication(7);

        //ques2
        pattern1(4);

        //ques 3
        int z=sumRec(5);
        System.out.println(z);


        //ques 4
        pattern2(4);

        //ques 5
        int result = fib(5);
        System.out.println(result);

        
        
    }
}
