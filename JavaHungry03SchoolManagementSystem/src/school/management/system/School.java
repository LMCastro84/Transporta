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
    private int totalMoneyEarned;
    private int totalMoneySpent;

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

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
    
    
}
