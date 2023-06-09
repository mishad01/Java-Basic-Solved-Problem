public class dog extends Animal {
    private String earShape;
    private String tailShape;

    public dog(String type,double weight){
        this(type,weight,"perky","curled");
    }
    public dog(){
        super("Dog","Big",56.00);
    }



    public dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15? "small" : (weight<35 ? "medium":"large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    } @Override
    public String toString() {
        return "dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    public void makenoise(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog walk,run and wage their tail");
        if(speed=="Slow"){
            walk();
            wagtail();
        }
        else{
            run();
            bark();
        }
        System.out.println();
    }
    private void bark(){
        System.out.println("WOOF");
    }
    private void run(){
        System.out.println("Dog Running");
    }
    private void walk(){
        System.out.println("Dog walking");
    }
    private void wagtail(){
        System.out.println("Tail Wagging");
    }
}
