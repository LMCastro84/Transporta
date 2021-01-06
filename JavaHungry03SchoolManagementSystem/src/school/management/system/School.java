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
    }
}
