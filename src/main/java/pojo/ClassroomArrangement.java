package pojo;

public class ClassroomArrangement {
    private int id;
    private int classroomId;
    private int courseTeacherId;
    private int studentId;
    private int week;
    private int time;
    private int date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getCourseTeacherId() {
        return courseTeacherId;
    }

    public void setCourseTeacherId(int courseTeacherId) {
        this.courseTeacherId = courseTeacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ClassroomArrangement{" +
                "id=" + id +
                ", classroomId=" + classroomId +
                ", courseTeacherId=" + courseTeacherId +
                ", studentId=" + studentId +
                ", week=" + week +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
