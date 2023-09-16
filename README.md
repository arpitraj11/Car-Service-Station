# Car-Service-Station

This is a simple Java software for a car service station, implemented using Object-Oriented Programming (OOP) principles. The software caters to different types of cars (Hatchback, Sedan, SUV) and provides various services like Basic Service, Engine Fixing, Clutch Fixing, Brake Fixing, and Gear Fixing. It generates a detailed bill with the total amount for each service request based on the type of car specified and the requested service codes.

## Features

- Supports different types of cars: Hatchback, Sedan, SUV.
- Offers various services with different prices for each car type.
- Generates a detailed bill with service names, car types, and charges.
- Includes complimentary cleaning if the total service bill is more than ₹10,000.

## Classes

### Car

- Represents a car with a specific type (Hatchback, Sedan, or SUV).

### Service

- Represents a car service with a service code, name, and prices for Hatchback, Sedan, and SUV.
- Provides a method to get the service price based on the car type.

### Bill

- Manages a list of services and cars for generating the bill.
- Calculates the total bill by iterating through services and cars, considering the car type and service prices.
- Includes an option for complimentary cleaning if the total bill exceeds ₹10,000.

### BasicService, EngineFixing, ClutchFixing, BrakeFixing, GearFixing

- Subclasses of Service, each representing a specific car service with predefined service code, name, and prices for different car types.

## Usage

1. Create instances of cars and service classes.
2. Add services and cars to the bill using the `addService` and `addCar` methods of the Bill class.
3. Call the `generateBill` method of the Bill class to calculate and display the bill.

Example in `Main` class:

```java
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
