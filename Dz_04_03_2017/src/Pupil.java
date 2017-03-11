public class Pupil implements Comparable<Pupil> {
    int grade;

    public Pupil(int grade) {
        this.grade = grade;
    }


    @Override
    public int compareTo(Pupil o) {

        return o.grade - this.grade;
    }
}
