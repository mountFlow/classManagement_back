package pojo;

public class CourseClass {

    private int id;
    private int courseTeacherId;
    private int classId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseTeacherId() {
        return courseTeacherId;
    }

    public void setCourseTeacherId(int courseTeacherId) {
        this.courseTeacherId = courseTeacherId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "id=" + id +
                ", courseTeacherId=" + courseTeacherId +
                ", classId=" + classId +
                '}';
    }
}
