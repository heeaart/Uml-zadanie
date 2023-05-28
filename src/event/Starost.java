package event;
import java.time.LocalDate;

public class Starost extends Student{
    private String groupName;
    public Starost(String name, String surname) {
        super(name, surname);
    }
    public boolean postponeColloquium(LocalDate date)
    {
        return true;
    }
}