package SerializationAndDeserialization.main.java.yagiz.Entity;

import java.io.Serializable;

public class Demo implements Serializable{
    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
