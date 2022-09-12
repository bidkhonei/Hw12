// Java program for the above approach

import java.util.ArrayList;
import java.util.List;


public class Analysis {
    private List<Integer> evenList = new ArrayList<Integer> ();
    private List<Integer> mainList = new ArrayList<Integer> ();
    private List<Integer> oddList = new ArrayList<Integer> ();
    private Integer counter = 0;
    ;

    // Function to print odd numbers
    public void SetOddNumber() {

        synchronized (this) {
            // Print number till the N
            while (counter < main.input) {

                // If count is even then add
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait ();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace ();
                    }
                }

                // add the number
                oddList.add (counter);
                mainList.add (counter);

                // Increment counter
                counter++;

                // Notify to second thread
                notify ();
            }
        }
    }

    // Function to print even numbers
    public void SetEvenNumber() {
        synchronized (this) {
            // add number till the N
            while (counter < main.input) {

                // If count is odd then add
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait ();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace ();
                    }
                }

                // add the number
                evenList.add (counter);
                mainList.add (counter);

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify ();
            }

        }
    }

    @Override
    public String toString() {
        return "analysis{" +
                "mainList=" + mainList +"\n"+
                "evenList=" + evenList +"\n"+
                "oddList=" + oddList +
                '}';
    }
}
