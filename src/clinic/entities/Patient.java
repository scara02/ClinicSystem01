package clinic.entities;


public class Patient {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;

    public Patient(String name, String surname, Integer age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }
    public Patient(Integer id, String name, String surname, Integer age) {
        this(name, surname, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient {" +
                "id = " + getId() +
                ", name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", age = '" + getAge() + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
