package Clone.main.java.yagiz;

import Clone.main.java.yagiz.Entity.Student;

public class CloneMain {
    public static void main(String[] args){
        try{
            Student student=new Student(1,"yagiz");
            Student student2=student.cloneStudent();

            System.out.println(
                "Student Number:\t"+student.getId() +"\n"+
                "Name:\t"+student.getName()         +"\n"+
                "Clone Object:"                   +"\n"+
                "Student Number:\t"+student2.getId()+"\n"+
                "Name:\t"+student2.getName()        +"\n");
        }catch(CloneNotSupportedException ex){
            System.err.println(ex.getMessage());
        }
    }
}
