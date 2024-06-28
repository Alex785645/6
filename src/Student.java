import java.util.*;

public class Student {
    private static int indexCounter = 1;
    private String indexNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private String status;
    private int currentSemester;
    private StudyProgramme studyProgramme;
    private Map<String, Integer> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date birthDate) {
        this.indexNumber = "s" + indexCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.status = "kandydat";
        this.currentSemester = 1;
        this.grades = new HashMap<>();
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.status = "student";
    }

    public void addGrade(int grade, String subject) {
        grades.put(subject, grade);
    }

    public void promoteToNextSemester() {
        long itns = grades.values().stream().filter(grade -> grade < 3).count();
        if (currentSemester < studyProgramme.getNumberOfSemesters() && itns <= studyProgramme.getMaxITNs()) {
            currentSemester++;
        }
        if (currentSemester == studyProgramme.getNumberOfSemesters()) {
            status = "absolwent";
        }
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Student{" +
                "indexNumber='" + indexNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", status='" + status + '\'' +
                ", currentSemester=" + currentSemester +
                ", studyProgramme=" + studyProgramme +
                ", grades=" + grades +
                '}';
    }
}
