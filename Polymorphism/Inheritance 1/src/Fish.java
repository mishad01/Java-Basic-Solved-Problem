public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscle(){
        System.out.println("Muscle Moving");
    }
    private void moveBackfin(){
        System.out.println("Backfin Moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if(speed=="fast"){
            moveBackfin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
