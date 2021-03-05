package sample;

import java.util.ArrayList;
import java.util.Collections;

public class Main{

    public static void main(String[] args) {

        ArrayList arr1 = new ArrayList();
        ArrayList arr2    =new ArrayList();
        Mythread thread0 = new Mythread();
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();
        Mythread thread3 = new Mythread();
        Mythread thread4 = new Mythread();
        Mythread thread5 = new Mythread();
        Mythread thread6 = new Mythread();
        Mythread thread7 = new Mythread();
        Mythread thread8 = new Mythread();
        Mythread thread9 = new Mythread();


        arr1.add(thread0.maxDiv(1, 10000));
        arr1.add(thread1.maxDiv(10001, 20000));
        arr1.add(thread2.maxDiv(20001, 30000));
        arr1.add(thread3.maxDiv(30001, 40000));
        arr1.add(thread4.maxDiv(40001, 50000));
        arr1.add(thread5.maxDiv(50001, 60000));
        arr1.add(thread6.maxDiv(60001, 70000));
        arr1.add(thread7.maxDiv(70001, 80000));
        arr1.add(thread8.maxDiv(80001, 90000));
        arr1.add(thread9.maxDiv(90001, 100000));
        arr2.add(thread0.maxDivisor);
        arr2.add(thread1.maxDivisor);
        arr2.add(thread2.maxDivisor);
        arr2.add(thread3.maxDivisor);
        arr2.add(thread4.maxDivisor);
        arr2.add(thread5.maxDivisor);
        arr2.add(thread6.maxDivisor);
        arr2.add(thread7.maxDivisor);
        arr2.add(thread8.maxDivisor);
        arr2.add(thread9.maxDivisor);
        int index = arr2.indexOf(Collections.max(arr2));
        System.out.println(arr1.get(index)+" has the largest number of divisors and is has "+arr2.get(index)+ " divisors");

    }
}
