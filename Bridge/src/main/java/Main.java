public class Main {
    public static void main(String[] args) {
        Workshop produce = new Produce();
        Workshop assemble = new Assemble();

        Vehicle boat = new Boat(produce, assemble);
        boat.manufacture();
    }

}
