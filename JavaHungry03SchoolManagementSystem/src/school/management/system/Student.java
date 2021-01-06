package school.management.system;

/**
 *
 * @author luisc This class is responsible for keeping the track of students
 * fees, name, grade and fees paid.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Fees for every student: 30000 Fees paid initially - 0
     *
     * @param id student id - unique
     * @param name student name
     * @param grade student grade
     */
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //student's name and id are immutable
    /**
     *
     * @param grade new student's grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Add fees to fees paid The school
     * recieves funds
     *
     * @param fees paid by student
     */
    public void payFees(int fees) {
        feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }
}
