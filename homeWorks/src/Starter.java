public class Starter {

    public static void main(String args[ ]){

        ClosestNum c = new ClosestNum();
        c.setUpNumbers();
        int firstDelta = c.findDelta(c.firstEntered, c.etalonNum);
        int secondDelta = c.findDelta(c.secondEntered, c.etalonNum);
        c.findClosestNum(firstDelta, secondDelta);

    }
}
