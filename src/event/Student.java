package event;

import java.time.LocalDate;

public class Student {
    private String name, surname;
    private LocalDate birthday;
    private int scientePoints;
    private int lifePoints;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void learn(LocalDate from, LocalDate to)
    {

    }

    public void party(LocalDate from, LocalDate to)
    {
        lifePoints++;
    }

    public boolean isGoodStudent()
    {
        return lifePoints > scientePoints;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getScientePoints() {
        return scientePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }


}