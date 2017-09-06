public class Starter {

    public static void main(String args[ ]){

        ClosestNumber c = new ClosestNumber();
        c.setUpNumbers();
        int firstDelta = c.findDelta(c.firstEntered, c.etalonNum);
        int secondDelta = c.findDelta(c.secondEntered, c.etalonNum);
        c.findClosestNum(firstDelta, secondDelta);

    }
}
