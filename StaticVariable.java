public class StaticVariable {
    static int age = 23;
    public void displayage(){
        System.out.println("Age = " + age);
    }
    public void updateage(){
        age = age + 1;
    }
    public static void main(String[]args){
        StaticVariable obj = new StaticVariable();
        obj.updateage();
        obj.displayage();
        StaticVariable obj1 = new StaticVariable();
        obj1.displayage();
    }
}

