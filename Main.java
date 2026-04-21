public class Main {
    public static void main(String[] args) {

        // Create students
        Student s1 = new Student("Juan", "2023001", 50000);
        Student s2 = new Student("Maria", "2023002", 50000);

        // Create teachers
        Teacher t1 = new Teacher("Mr. Cruz", "Programming", 30000);
        Teacher t2 = new Teacher("Ms. Santos", "Database", 32000);

        // Create department
        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        // Create college
        College engineering = new College("College of Engineering");
        engineering.add(csDept);

        // Add direct student to college
        Student s3 = new Student("Pedro", "2023003", 60000);
        engineering.add(s3);

        // Display structure
        System.out.println("=== UNIVERSITY STRUCTURE ===");
        engineering.showDetails("");

        // Total students
        System.out.println("\nTotal Students: " + engineering.getStudentCount());

        // Total budget
        System.out.println("Total Budget: " + engineering.getBudget());
    }
}