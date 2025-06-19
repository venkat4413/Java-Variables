public class UninitializedLocalVariable {
    public static void main(String[] args) {
        // The following line will cause a compilation error because 'num' is not initialized.
        int num;
        System.out.println("Uninitialized Local Variable = " + num);

        // To fix the error, initialize the variable before use
        //int num = 4413; // Initializing the variable
        //System.out.println("Initialized Local Variable = " + num);
    }
}