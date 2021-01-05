package school.management.system;

/**
 *
 * @author luisc
 * This class is responsible for keeping the track of teacher's name,
 * id and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

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
    }


}
