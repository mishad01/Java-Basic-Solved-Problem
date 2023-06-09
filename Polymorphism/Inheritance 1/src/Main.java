public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("CAT","Big",56.00);
        doAnimal(animal,"Slow");
        dog Dog = new dog();
        doAnimal(Dog,"Fast");

        dog yourkie = new dog("Yourke",15);
        doAnimal(yourkie,"fast");
        dog retriver = new dog("retrivere",65,"floppy","swimmer");
        doAnimal(retriver,"slow");
        Fish goldy = new Fish("Goldfish",0.25,2,3);
        doAnimal(goldy,"fast");
    }
    public static void doAnimal(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("- - - - - - -");
    }
}