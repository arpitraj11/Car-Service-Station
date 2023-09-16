
public class Main {
    public static void main(String[] args) {

        Car hatchback = new Car("Hatchback");

        BasicService basicService = new BasicService();
        EngineFixing engineFixing = new EngineFixing();
        GearFixing gearFixing = new GearFixing();

        Bill bill = new Bill();
        bill.addService(basicService);
        bill.addService(engineFixing);
        bill.addService(gearFixing);
        bill.addCar(hatchback);

        bill.generateBill();
    }
}