import event.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie nazwisko");
        Student studentt = new Student(scanner.next(), scanner.next());

        System.out.println("scientepoints: ");
        studentt.learn(LocalDate.of(2023,3,27), LocalDate.of(2023, 3, 28));
        studentt.getScientePoints();

        System.out.println("lifepoints: ");
        studentt.party(LocalDate.of(2023,3,27), LocalDate.of(2023, 3, 28));
        studentt.getLifePoints();

        studentt.isGoodStudent();



    }
}