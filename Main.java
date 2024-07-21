public class Main{
    public static void main(String[] args){

        //These classes are realized by "Наследование"
        Person aPerson = new Person("Vasya", 15);
        Person bPerson = new officeWorker("Oleg", 23);
        Person cPerson = new carDriver("Remi", 40);

        //This is show, how "Полиморфизм" works
        aPerson.work();
        bPerson.work();
        cPerson.work();

        //Here I show, how "Инкапсуляция" work
        aPerson.setName("Kolya");
        System.out.println(aPerson.getName());
        //Это все основные принципы ООП
    }
}
