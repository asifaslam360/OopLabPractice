public class VariableDeclarationExample {
    public static void main(String[] args) {
        // Numeric types
        int age = 25;
        double salary = 55000.50;

        // Text/String type
        String name = "John Doe";

        // Boolean type
        boolean isStudent = false;

        // Character type
        char grade = 'A';

        // Array
        int[] scores = {90, 85, 95, 88, 92};

        // Object type
        Person person = new Person("Alice", 30);

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println("Scores: " + java.util.Arrays.toString(scores));
        System.out.println("Person: " + person);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
