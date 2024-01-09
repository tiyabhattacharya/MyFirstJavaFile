import java.lang.Math;

public class Arrays {
    public static void main(String[] args) {
        //ques1
        float [] arr={23.5f,34.5f,67.5f,56.6f,45.6f};
        float sum=0;
        for(float e: arr){
            sum=sum+e;
        }
        System.out.println(sum);


        //ques2
        int num=34;
        int [] arr1={23,34,56,67,78};
        for(int e:arr1){
            if(e==num){
                System.out.println("Number is present");
                break;
            }
    
        }

        //ques 3
        float [] marks={23,34,56,67,78};
        float sum1=0;
        for(float e:marks){
            sum1=sum1+e;
        }
        System.out.println(sum1/5);


        //ques 4
        int [][] mat1={{2,4,6},{3,5,7}};
        int [][] mat2={{1,2,3},{4,5,6}};
        int [][] summat={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                  summat[i][j]=mat1[i][j]+mat2[i][j];

            }
        }
        for(int i=0;i<summat.length;i++){
            for(int j=0;j<summat[i].length;j++){
                System.out.print(summat[i][j] + " ");
            }
            System.out.println("");
        }


       
        //ques 5
        int [] arrr={23,34,45,56,67,78};
        int n=arrr.length;
        int index= Math.floorDiv(n,2);
        for(int i=0;i<index;i++){
            int temp=arrr[i];
            arrr[i]=arrr[n-1-i];
            arrr[n-1-i]=temp;
        }
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i] +" ");
        }
        System.out.println("\n");


        //ques 6: find max element
        int [] ar1={23,34,45,56,67,78};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]>max){
                max=ar1[i];
            }
        }
        System.out.println(max);


        //ques7
        int [] ar2={23,34,45,56,67,78};
        int min= Integer.MAX_VALUE;
        for(int i=0;i<ar1.length;i++){
            if(ar2[i]<min){
                min=ar2[i];
            }
        }
        System.out.println(min);


        //ques 8
        int [] sarr={23,34,45,56,67,78};
        boolean isSorted=true;
        for(int i=0;i<sarr.length-1;i++){
            if(sarr[i]>sarr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(!isSorted){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
    }
}
