public class LocalVariableExample {
    public void sum() {
        int num1 = 4413;
        int num2 = 4412;
        int sum = num1 + num2;
        System.out.print("Sum = "+sum);
    }
    public static void main(String[]args){
        LocalVariableExample obj = new LocalVariableExample();
        obj.sum();
    }
} 
