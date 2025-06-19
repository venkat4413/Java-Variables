public class InstanceVariableExample {
    int age = 23;
    public void displayage(){
        System.out.println("Age = " + age);
    }
    public void updateage(){
        age = age + 1;
    }
    public static void main(String[]args){
        InstanceVariableExample obj = new InstanceVariableExample();
        obj.updateage();
        obj.displayage();
        InstanceVariableExample obj1 = new InstanceVariableExample();
        obj1.displayage();
    }
}