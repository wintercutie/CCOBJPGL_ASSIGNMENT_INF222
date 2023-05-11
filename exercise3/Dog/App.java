package Dog;

public class App {
    public static void main(String[] args) throws Exception {

        Chiweenie myPet = new Chiweenie();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
    }
}