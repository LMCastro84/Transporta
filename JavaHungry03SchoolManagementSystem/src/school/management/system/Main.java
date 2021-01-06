package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisc
 */
public class Main {

    public static void main(String[] args) {
        Teacher quim = new Teacher(1, "Quim", 500);
        Teacher maria = new Teacher(2, "Maria", 750);
        Teacher joana = new Teacher(3, "Joana", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(quim);
        teacherList.add(maria);
        teacherList.add(joana);

        Student ze = new Student(1, "Ze", 4);
        Student paula = new Student(2, "Paula", 12);
        Student joao = new Student(3, "Joao", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ze);
        studentList.add(paula);
        studentList.add(joao);

        School escola = new School(teacherList, studentList);

        ze.payFees(5000);
        System.out.println("Escola angariou " + escola.getTotalMoneyEarned());
        paula.payFees(6000);
        System.out.println("Escola angariou " + escola.getTotalMoneyEarned());

        System.out.println("----ESCOLA A PAGAR SALARIOS----");
        quim.receiveSalary(quim.getSalary());
        System.out.println("Escola pagou de Salario a(o) professor(a) " + quim.getName() + ", e de momento tem de credito "
                + escola.getTotalMoneyEarned());
        maria.receiveSalary(maria.getSalary());
        System.out.println("Escola pagou de Salario a(o) professor(a) " + maria.getName() + ", e de momento tem de credito "
                + escola.getTotalMoneyEarned());
    }
}
