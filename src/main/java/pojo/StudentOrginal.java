package pojo;

public class StudentOrginal {

    private int id ;
    private String grade;
    private String name ;
    //extra attribute
    private String classId ;
    private String password;
    private String studentNum;

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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

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

    @Override
    public String toString() {
        return "StudentOrginal{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", classId='" + classId + '\'' +
                ", password='" + password + '\'' +
                ", studentNum='" + studentNum + '\'' +
                '}';
    }
}
