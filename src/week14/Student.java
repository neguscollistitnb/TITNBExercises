package week14;

public class Student {
    private static int nextId = 1; // Tracks the next available ID
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;

        // Print student details
        System.out.println("New Student created:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public Student duplicate() {
        return new Student(this.name, this.age); // ID will be auto-incremented
    }

    // Getters for name, age, and id (for testing purposes)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

}
