//Create a Class
public class Person {
//

    //  Creating/using fields (instance variables)
    Integer id;
    String firstname;
    String surname;
    Integer age;
    static Integer index = 1;
    //

    //  Constructor method (+ showing global variables being modified inside method scope)
    Person (String f, String s, Integer a){
        this.firstname = f;
        this.surname = s;
        this.age = a;
        this.id = index;

        Person.index++;
    }
    //

    //  Accessors
    public Integer getAge(){
        return this.age;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getSurname(){
        return this.firstname;
    }

    public Integer getId(){
        return this.id;
    }
    //

    //  Mutators
    public void setAge(Integer a){
        this.age = a;
    }

    public void setFirstname(String f){
        this.firstname = f;
    }

    public void setSurname(String s){
        this.surname = s;
    }
    //

}
