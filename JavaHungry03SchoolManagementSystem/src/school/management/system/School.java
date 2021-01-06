package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Many teachers, many students Implements teachers and students using ArrayList
 *
 * @author luisc
 */
public class School {

    List<Teacher> teachers = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     *
     * @param teachers list of techers in school
     * @param students list of students in school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to school
     *
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to school
     *
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money spent by school (teachers's salary)
     *
     * @param moneySpent
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
