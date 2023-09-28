package SerializationAndDeserialization.main.java.yagiz.SDexampleWithUID.Entity;

import java.io.Serializable;

public class Emp implements Serializable{
    private static final long serialVersionUID =129348938L;
    private transient int a;
    public static int b;
    private String name;
    private int age;

    public Emp(int a, String name, int age) {
        this.a = a;
        this.name = name;
        this.age = age;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
