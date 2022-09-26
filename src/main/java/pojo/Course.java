package pojo;

public class Course {

    //1.根据表的属性新建对应的属性
    private int id ;
    private String courseName;;
    private int totalHour ;
   //extra attribute
    private String classType ; //课程类型
    private String evaluationMode ; //考察模式


    //2.自动生成对应的getter和setter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(int totalHour) {
        this.totalHour = totalHour;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getEvaluationMode() {
        return evaluationMode;
    }

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", totalHour=" + totalHour +
                ", classType='" + classType + '\'' +
                ", evaluationMode='" + evaluationMode + '\'' +
                '}';
    }
}
