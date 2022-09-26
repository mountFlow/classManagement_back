package pojo;

public class Classroom {

    private int id;
    private int building;
    private int floor;
    private String num;
    private String type;
    private int status;
    private int lentStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLentStatus() {
        return lentStatus;
    }

    public void setLentStatus(int lentStatus) {
        this.lentStatus = lentStatus;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", building=" + building +
                ", floor=" + floor +
                ", num=" + num +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", lentStatus=" + lentStatus +
                '}';
    }
}
