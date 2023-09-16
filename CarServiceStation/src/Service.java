public class Service {

    private String code;
    private String name;
    private int hatchbackPrice;
    private int sedanPrice;
    private int suvPrice;

    public Service(String code, String name, int hatchbackPrice, int sedanPrice, int suvPrice) {
        this.code = code;
        this.name = name;
        this.hatchbackPrice = hatchbackPrice;
        this.sedanPrice = sedanPrice;
        this.suvPrice = suvPrice;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice(String carType) {
        if (carType.equals("Hatchback")) {
            return hatchbackPrice;
        } else if (carType.equals("Sedan")) {
            return sedanPrice;
        } else if (carType.equals("SUV")) {
            return suvPrice;
        } else {
            return 0; // Invalid car type
        }
    }
}
class BasicService extends Service {
    public BasicService() {
        super("BS01", "Basic Servicing", 2000, 4000, 5000);
    }
}

class EngineFixing extends Service {
    public EngineFixing() {
        super("EF01", "Engine Fixing", 5000, 8000, 10000);
    }
}

class ClutchFixing extends Service {
    public ClutchFixing() {
        super("CF01", "Clutch Fixing", 2000, 4000, 6000);
    }
}

class BrakeFixing extends Service {
    public BrakeFixing() {
        super("BF01", "Brake Fixing", 1000, 1500, 2500);
    }
}

class GearFixing extends Service {
    public GearFixing() {
        super("GF01", "Gear Fixing", 3000, 6000, 8000);
    }
}

