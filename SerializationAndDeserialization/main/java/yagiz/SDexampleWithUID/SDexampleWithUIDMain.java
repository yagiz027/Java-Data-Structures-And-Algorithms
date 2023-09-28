package SerializationAndDeserialization.main.java.yagiz.SDexampleWithUID;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import SerializationAndDeserialization.main.java.yagiz.SDexampleWithUID.Entity.Emp;
import SerializationAndDeserialization.main.java.yagiz.SDexampleWithUID.Entity.SeriazableExample;

public class SDexampleWithUIDMain {
    private static Emp object =new Emp(1,"yagiz",22);
    private static String filename="TestTXT.txt";
    public static void main(String[] args) {
        try{
            FileOutputStream file=new FileOutputStream(filename);
            ObjectOutputStream out=new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();
 
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization.");
            SeriazableExample.printdata(object);
 
            // value of static variable changed
            Emp.b=2000;
            
        }catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        object = null;

        try{
            // Reading the object from a file
            FileInputStream file = new FileInputStream
                                         (filename);
            ObjectInputStream in = new ObjectInputStream
                                         (file);
 
            // Method for deserialization of object
            object = (Emp)in.readObject();
 
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization.");
            SeriazableExample.printdata(object);
 
        }catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                                " is caught");
        }
    }
}
