public class Employee implements Person{

    String name;
    String surname;
    int age;
    int retirementAge;
    public Employee(String name, String surname, int age, int retirementAge) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.retirementAge = retirementAge;
    }


    @Override
    public void getinfo() {
        int yearsToWork = retirementAge - age;
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nYears left to work: " + yearsToWork);
    }
}
