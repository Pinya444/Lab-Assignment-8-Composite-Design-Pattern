import java.util.*;

public class College implements UniversityComponent {
    private String name;
    private List<UniversityComponent> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        components.add(component);
    }

    public void remove(UniversityComponent component) {
        components.remove(component);
    }

    public String getName() { return name; }

    public double getBudget() {
        double total = 0;
        for (UniversityComponent c : components) {
            total += c.getBudget();
        }
        return total;
    }

    public int getStudentCount() {
        int count = 0;
        for (UniversityComponent c : components) {
            count += c.getStudentCount();
        }
        return count;
    }

    public void showDetails(String indent) {
        System.out.println(indent + "College: " + name);
        for (UniversityComponent c : components) {
            c.showDetails(indent + "  ");
        }
    }
}