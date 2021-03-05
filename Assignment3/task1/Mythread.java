package sample;

public class Mythread extends Thread{
    public Mythread(String name) {
        super(name);
    }

    public void run(int s,int e){
     for(int i=s;i<e;i++){
         System.out.println(getName() +" print "+i);
     }
 }


}
