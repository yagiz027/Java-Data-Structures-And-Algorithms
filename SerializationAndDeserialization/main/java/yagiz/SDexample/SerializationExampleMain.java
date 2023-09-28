package SerializationAndDeserialization.main.java.yagiz.SDexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import SerializationAndDeserialization.main.java.yagiz.Entity.Demo;

public class SerializationExampleMain{
    public static void main(String[] args){
        Demo object =new Demo(1,"yagizeris");
        String filename="demo.ser";
        try{
            FileOutputStream file=new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object); //Serialization nesnesi için method
            
            out.close();
            file.close();

            System.out.println("Object has been serialized successfully");
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }

        Demo object1=null;

        //Deserialization

        try{
            FileInputStream file =new FileInputStream(filename);
            ObjectInputStream in=new ObjectInputStream(file);

            object1=(Demo)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("a="+object1.a);
            System.out.println("b="+object1.b);
        }        
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        } 
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}