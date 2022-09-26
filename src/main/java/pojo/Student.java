package pojo;

public class Student {

    private int id ;
    private String grade;
    private String name ;
    //extra attribute
    private String className ;
    private String major ;
    private String password;
    private String studentNum;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", major='" + major + '\'' +
                ", password='" + password + '\'' +
                ", studentNum=" + studentNum +
                '}';
    }
}
