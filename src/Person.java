/**
 * Створення класу Person
 * Клас має приватні поля surname , name, age
 *  Має сеттери та геттери для цих полей
 *  А також метод printInfo, що виводить та повертає рядок
 */
public class Person {
    private String surname;
    private String name;
    private int age;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String printInfo() {
        System.out.println("Человек " + surname + " " + name + ", возраст: " + age);
        return "Человек " + surname + " " + name + ", возраст: " + age;
    }
}
