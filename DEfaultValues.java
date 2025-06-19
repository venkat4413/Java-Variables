public class DEfaultValues {
        int intVar;
        float floatVar;
        double doubleVar;
        char charVar;
        String stringVar;
        boolean booleanVar;
    public static void main(String[] args) {
        int num;
        DEfaultValues obj = new DEfaultValues();
        System.out.println("Default Integer Value = " + obj.intVar);
        System.out.println("Default Float Value = " + obj.floatVar);
        System.out.println("Default Double Value = " + obj.doubleVar);
        System.out.println("Default Char Value = " + obj.charVar);
        System.out.println("Default String Value = " + obj.stringVar);
        System.out.println("Default Boolean Value = " + obj.booleanVar);
        //System.out.println("Uninitialized Local Variable = " + num);
    }
}