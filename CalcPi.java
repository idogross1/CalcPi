import java.util.ArrayList;
import java.util.Scanner;

public class CalcPi {

	public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("enter number of tries");
        int triesNum = s.nextInt();
        Pi[] threadsArray = new Pi[triesNum]; // creating array for the threads
        for(int i = 0; i < triesNum; i++) {
            threadsArray[i] = new Pi(); //initializeing the threads
            threadsArray[i].start(); // starting all the threads
        }
        Pi.calcPi();
        Pi.print();
    }
}