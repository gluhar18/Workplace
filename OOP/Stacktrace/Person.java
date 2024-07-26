public class Person {
    protected String name;
    protected int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void work(){
        System.out.println("I'm working");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
