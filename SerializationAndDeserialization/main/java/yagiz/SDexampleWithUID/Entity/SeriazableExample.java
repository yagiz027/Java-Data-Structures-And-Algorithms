package SerializationAndDeserialization.main.java.yagiz.SDexampleWithUID.Entity;

public class SeriazableExample {
    public static void printdata(Emp object){
        System.out.println("name = " + object.getName());
        System.out.println("age = " + object.getAge());
        System.out.println("a = " + object.getA());
        System.out.println("b = " + Emp.b);
    }
}
