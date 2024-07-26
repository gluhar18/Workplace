public class officeWorker extends Person{
    officeWorker(String name, int age){
        super(name, age);
    }

    @Override
    void work(){
        System.out.println("I'm working in office");
    }
}
