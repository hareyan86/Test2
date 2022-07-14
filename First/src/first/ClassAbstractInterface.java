package first;

interface Main_Interface {
    void learnCoding();
    void learnProgrammingLanguage();
    void contribute();
}
  
abstract class Student implements Main_Interface {
  
    // Overriding the methods
    @Override public void learnCoding()
    {
        System.out.println(
            "Learning Coding");
    }
    @Override public void learnProgrammingLanguage()
    {
        System.out.println(
            "Learning Programming Language");
    }
}
  
class Normal extends Student {
    @Override public void contribute()
    {
        System.out.println(
            "Share the knowledge");
    }
}
  
public class ClassAbstractInterface {
    public static void main(String[] args)
    {
        Normal stud = new Normal();
        stud.learnCoding();
        stud.learnProgrammingLanguage();
        stud.contribute();
    }
}
