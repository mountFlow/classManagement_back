package pojo;

public class ClassPojo {

    private int id;
    private int grade;
    private String className;
    private int totalStudents;
    private String major;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "ClassPojo{" +
                "id=" + id +
                ", grade=" + grade +
                ", className='" + className + '\'' +
                ", totalStudent=" + totalStudents +
                ", major='" + major + '\'' +
                '}';
    }
}
