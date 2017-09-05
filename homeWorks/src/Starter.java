
import java.util.Scanner;

public class Starter {

    public static void main(String args[ ]){
        Scanner in = new Scanner(System.in);

        int firstDelta;
        int secondDelta;

        int etalonNum = 10;

        System.out.println("Enter first number: ");
        int first = in.nextInt();
        System.out.println("Your input is: " + first);
        if (first <= etalonNum){
            firstDelta = etalonNum - first;
        }else{
            firstDelta = first - etalonNum;
        }
        System.out.println("Difference this num to etalon is: " + firstDelta);

        System.out.print("Enter second number: ");
        int second = in.nextInt();
        System.out.println("Your input is: " + second);
        if (first <= etalonNum){
            secondDelta = etalonNum - second;
        }else{
            secondDelta = second - etalonNum;
        }
        System.out.println("Difference this num to etalon is: " + secondDelta);

        if(firstDelta == secondDelta){
            System.out.println("Entered Numbers is equals!");
        }else if(firstDelta < secondDelta){
            System.out.println("Number closer to etalon: " + first);
        }else{
            System.out.println("Number closer to etalon: " + second);
        }

    }
}
