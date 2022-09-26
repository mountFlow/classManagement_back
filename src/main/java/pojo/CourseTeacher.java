package pojo;

public class CourseTeacher {

    //1.根据表的属性新建对应的属性
    private int id;
    private int teacherId;
    private int courseId;


    //2.自动生成对应的getter和setter方法


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "CourseTeacher{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", courseId=" + courseId +
                '}';
    }
}
