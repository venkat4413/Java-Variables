

public class TypeCasting {
    public static void main(String[] args) {
        //implicit casting
        int num = 100;
        double longnum = num;  //converting integer to double implicitly
        char c =(char) longnum;
        System.out.println("Implicit Casting = " + longnum);
        System.out.println("Char to Double = " + c);

        
      //explicit conversion
       double decimal = 9.98;
       int number = (int)decimal;  // converts the decimal value in to integer explicitly i.e., (int) is mentioned before the decimal.
       System.out.println("Explicit Casting = " + number);  

      char d = 'V';
      int num1 = (int)d;
      System.out.println("Character to Int = " + num1);
    }
}