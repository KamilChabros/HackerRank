import java.util.*;

class Checker implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        if (a.getCgpa() == b.getCgpa()) {
            return a.getFirstName() != b.getFirstName() ? a.getFirstName().compareTo(b.getFirstName()) :
                    b.getId() - a.getId();
        } else {
//            swapping b and a, changing order to increasing
//            below result shows decreasing order
            return (int) (1000 * (b.getCgpa() - a.getCgpa()));
        }
    }
}

class Student {
    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfStudents = Integer.parseInt(scanner.nextLine());
//        int testcases = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();
        while (noOfStudents > 0) {

            Student student = new Student(scanner.nextInt(),scanner.next(), scanner.nextDouble());
            studentList.add(student);
            noOfStudents--;
        }
        Collections.sort(studentList, new Checker());
        for (Student student: studentList){
            System.out.println(student.getFirstName());
        }
    }
}
