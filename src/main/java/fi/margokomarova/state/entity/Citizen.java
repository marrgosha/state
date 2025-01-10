package fi.margokomarova.state.entity;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Citizen {
    private final Long id;
    private String name;
    private String surname;
    private Integer age;
    private State state;
    static AtomicLong nextID = new AtomicLong();

    public Citizen() {
        this.id = nextID.incrementAndGet();
        name = getRandomName();
        surname = getRandomName();
        age = (Integer) (int) (Math.random() * 100);
        this.state = State.getInstance();
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getRandomName() {
        int min = 5;
        int max = 10;
        Random gen = new Random();
        int length = min + gen.nextInt(max - min + 1);
        String r = "";
        for (int i = 0; i < length; i++) {
            r += (char) (Math.random() * 26 + 97);
        }
        return r;
    }

    @Override
    public String toString() {
        return "citizen id=" + id +
                ",name=" + name +
                ",surname=" + surname +
                ",age=" + age;


    }
}
