package web_hibernate.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    @NotEmpty(message = "Name shouldn't be empty")
    private String name;
    @Column(name = "surname")
    @NotEmpty(message = "Surname shouldn't be empty")
    private String surname;
    @Column(name = "age")
    @Min(value = 0, message = "Age should be greater 0")
    private byte age;
    @Column(name = "job")
    @NotEmpty(message = "Write your job")
    private String job;

    public User() {
    }

    public User(String name, String surname, byte age, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
