public class Student {
    String name;
    int age;
    String collegeName;
    public Student() {

    }

    public Student(String name, int age, String collegeName) {
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
    }

//    public void init(String name, int age, String collegeName) {
//        this.name = name;
//        this.age = age;
//        this.collegeName = collegeName;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
