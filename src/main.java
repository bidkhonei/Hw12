import java.util.Scanner;

public class main {
    public static int input = new Scanner (System.in).nextInt ();

    public static void main(String[] args) {
        Analysis analysis = new Analysis ();

        Thread thread1 = new Thread (new Runnable () {
            public void run() {
                analysis.SetEvenNumber ();
            }
        });

        Thread thread2 = new Thread (new Runnable () {
            public void run() {
                analysis.SetOddNumber ();
            }
        });

        thread1.start ();
        thread2.start ();
        System.out.println (analysis);


    }

}