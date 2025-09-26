public class Boat extends Vehicle{

    protected Boat(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Boat ");
        workShop1.work();
        workShop2.work();
    }
}
