import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static TreeSet<Pupil> classList = new TreeSet<>();

    public static void main(String[] args) {
        System.out.println("введите оценки десяти учеников:");
        for (int i = 0; i < 10; i++) {
            classList.add(new Pupil(scanner.nextInt()));
        }
        System.out.println("введите нужную оценку:");
        int grade = scanner.nextInt();
        Pupil tempP = new Pupil(grade);
        int temp = 1;
        for (Pupil pupil:classList) {
            if(pupil.compareTo(tempP)<0){
                System.out.println(pupil.grade);
            }
            temp++;
        }
    }
}
