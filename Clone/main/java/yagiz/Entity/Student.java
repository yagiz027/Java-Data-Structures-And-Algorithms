package Clone.main.java.yagiz.Entity;

// By implementing Cloneable interface
// we make sure that instances of class Student
// can be cloned.
public class Student implements Cloneable{
    private int id;
    private String name;

    public Student(){};

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student cloneStudent() throws CloneNotSupportedException{
        return (Student) super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
