package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        if( name == null || name.equals("") || name.length() > 40 || age < 0 || age > 120 ){
            throw new IllegalArgumentException("Check if name has less than 40 characters and age is between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
