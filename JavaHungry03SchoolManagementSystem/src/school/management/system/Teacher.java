package school.management.system;

/**
 *
 * @author luisc This class is responsible for keeping the track of teacher's
 * name, id and salary
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     *
     * @param id teacher id
     * @param name teacher name
     * @param salary teacher salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned Removes from total money earned of school
     *
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of teacher: " + name + ", Total salary earned: " + salaryEarned;
    }

}
