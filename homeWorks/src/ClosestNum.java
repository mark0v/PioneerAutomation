import java.util.Scanner;

/**
 * Created by onedell on 07.09.2017.
 */
public class ClosestNum {
    int firstEntered;
    int secondEntered;
    int etalonNum;

    public int findDelta(int Num, int Etalon){
        if (Num <= Etalon){
            return Etalon - Num;
        }else{
            return Num - Etalon;
        }
    }

    public void setUpNumbers(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number: ");
        firstEntered = in.nextInt();
        System.out.println("Your input is: " + firstEntered);

        System.out.println("Enter Second number: ");
        secondEntered = in.nextInt();
        System.out.println("Your input is: " + secondEntered);

        System.out.println("Enter Etalon number: ");
        etalonNum = in.nextInt();
        System.out.println("Your input is: " + etalonNum);
    }

    public void findClosestNum(int firstDelta, int secondDelta){
        if(firstDelta == secondDelta){
            System.out.println("Entered Numbers is equals!");
        }else if(firstDelta < secondDelta){
            System.out.println("Number closer to etalon: " + firstEntered);
        }else{
            System.out.println("Number closer to etalon: " + secondEntered);
        }
    }
}

/*
ClosestNum c = new ClosestNum();
c.setUpNumbers();
        int firstDelta = c.findDelta(c.firstEntered, c.etalonNum);
        int secondDelta = c.findDelta(c.secondEntered, c.etalonNum);
        c.findClosestNum(firstDelta, secondDelta);
        */