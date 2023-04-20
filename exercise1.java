public class exercise1 {
    static boolean iwillBehave = true;
    static boolean IwillGraduate = true;

    public static void main(String[] args) throws Exception {
        // Agreement

        // Precondition
        assert iwillBehave == true : "Para gumraduate.";

        // method
        College();

        // Postcondition
        assert IwillGraduate == true : "Para magka-work.";
    }

    static void College() {
        IwillGraduate = false;
        System.out.println("Yay!");
    }
}
