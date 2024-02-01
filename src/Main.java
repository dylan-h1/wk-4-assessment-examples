import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Harvey", "Specter", 18);
        Person person2 = new Person("Captain", "Price", 52);

        //  ArrayList constructor
        ArrayList<Person> persons = new ArrayList<>();
        //

        //  ArrayList adding
        persons.add(person1);
        persons.add(person2);
        //

        //  How to call a method, passing parameters
        person1.getFirstname();
        person1.setFirstname("Dylza");
        person1.getFirstname();
        //

        //  Use of the for each loop
        for(Person person : persons){
            //  Conditional statements
            if(person.getId() == 1){
                //  Using local variables
                String name = person.getFirstname();
                //

                //  Using println
                System.out.println(name);
                //
            }

            if(person.getFirstname().contains("e")){
                System.out.println(person.getFirstname());
            }
            //
        }
        //

        //  ArrayList getting an element by index
        for(int index = 0; index < persons.size(); index++){
            System.out.println(persons.get(index).getFirstname());
            String sname = persons.get(index).getSurname();

            //  String methods: getting a substring
            System.out.println(sname.substring(0, 2));
            //

            //  String methods: getting the length
            System.out.println(sname.length());
            //
        }
        //

        //  ArrayList getting number of elements in the list
        Integer nOfElements = persons.size();
        System.out.println(nOfElements);
        //



    }
}
