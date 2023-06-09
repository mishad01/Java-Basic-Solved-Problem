public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Start Enginee");
    }
    public void drive(){
        System.out.println("Driving, Type is " + getClass().getSimpleName()); //getClass().getSimpleName() its show us the class name
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car -> Engine is running");

    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinder;

    public GasPoweredCar(String description){
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("GAS -> ALL %d cylinder are fired up, Ready! %n",cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("GAS -> Usages exceeds the average %.2f %n",avgKmPerLiter);
    }
}
class ElectricalCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricalCar (String description){
        super(description);
    }
    public ElectricalCar(String description,double avgKmPerCharge,int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    public void startEngine() {
        System.out.printf("Electrical -> ALL %d batter are fired up, Ready! %n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electrical -> Usages exceeds the average %.2f %n",avgKmPerCharge);
    }
}

