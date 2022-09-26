package pojo;

public class ClassroomAvailable {
    private int id;
    private int classroomId;
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
                ", week=" + week +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
