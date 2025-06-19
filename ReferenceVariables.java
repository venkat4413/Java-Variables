public class ReferenceVariables {
    public static void main(String[] args) {
        String name = "Venkat";
        int[] numbers = {1, 2, 3, 4, 5};
        String[] venkat = {"venky","pullarao","lokesh"};
        System.out.println("Name = "+ name);
        System.out.print("Numbers = " );
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("Names");
        for (String Chowdary : venkat){
            System.out.print(Chowdary + " ");
        }
    }
}