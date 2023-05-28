package event;

import java.util.List;
import java.util.Objects;

public class University {
    private List<Student> students;

    public void addStudent()
    {
        System.out.println("student dodany");
    }
    public Student getStudent(String name, String surname)
    {
        int znalezione=0;
        for (Student i: students) {
            if (Objects.equals(i.getName(), name) && Objects.equals(i.getSurname(), surname)){
                System.out.println(i.getName()+" "+i.getSurname());
                znalezione++;
            }
        }
        if (znalezione==0){
            System.out.println("Nie znaleziono takeigo uzytkownika");
        }
        return null;
    }

    public boolean removeStudent(String name, String surname)
    {
        return false;
    }

}