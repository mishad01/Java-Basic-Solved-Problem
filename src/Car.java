public class Car {
    private String description;
    public void startEngine(){

    }public void drive(){

    }
    protected void runEngine(){

    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinder;
}
class ElectricalCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
}
class HybridCar extends Car{
    double avgKmPerLiter;
    int batterySize;
    int cylinders;
}
