package sample;
public class Main{



    public static void main(String[] args) {
Mythread m1=new Mythread("First thread");
Mythread m2=new Mythread("Second thread");
m1.run(1,11);
        System.out.println();
m2.run(11,21);
        System.out.println();
m1.run(21,31);


    }
}
