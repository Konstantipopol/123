public class Student implements Person{

    String name;
    String surname;
    int age;
    int studentID;
    public Student(String name, String surname, int age, int studentID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentID = studentID;
    }

    @Override
    public void getinfo() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nStudentID: " + studentID);
    }
}
