package sample;

public class Mythread extends Thread{
    public int maxDivisor;
    public int the_num;
    public int maxDiv(int s,int e) {

        maxDivisor=1;
        the_num = 1;
        for (int i= s; i <=e ; i++) {
            int temp=0;
            for (int j = 1; j <=e ; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if(temp>=maxDivisor) {
                maxDivisor = temp;
                the_num=i;
            }
        }
        return the_num;
    }


}
