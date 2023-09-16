import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Service> services = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();

    public void addService(Service service) {
        services.add(service);
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public void generateBill() {
        int totalBill = 0;
        boolean complimentaryCleaning = false;

        for (Car car : cars) {
            for (Service service : services) {
                int price = service.getPrice(car.getType());
                if (price > 0) {
                    totalBill += price;
                    System.out.println("Service: " + service.getName() + ", Car Type: " + car.getType() + ", Charges: ₹" + price);
                }
            }
        }

        if (totalBill > 10000) {
            complimentaryCleaning = true;
        }

        System.out.println("Total Bill: ₹" + totalBill);
        if (complimentaryCleaning) {
            System.out.println("Complimentary Cleaning Included");
        }
    }
}

