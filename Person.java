
public class Person {
    private  String name;
    private int age;

    public Person(){
        name = null;
        age = 0;
    }
    public Person(String NewName, int NewAge) {
        this.name = NewName;
        this.age = NewAge;
    }

    public String toString() {
        return name + " is " + age + " years old.";
    }

    public void incrementAge() {
        age += 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

