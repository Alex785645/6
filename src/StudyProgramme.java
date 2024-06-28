public class StudyProgramme {
    private String name;
    private String code;
    private int numberOfSemesters;
    private int maxITNs;

    public StudyProgramme(String name, String code, int numberOfSemesters, int maxITNs) {
        this.name = name;
        this.code = code;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNs = maxITNs;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getMaxITNs() {
        return maxITNs;
    }

    public String toString() {
        return "StudyProgramme{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", numberOfSemesters=" + numberOfSemesters +
                ", maxITNs=" + maxITNs +
                '}';
    }
}
