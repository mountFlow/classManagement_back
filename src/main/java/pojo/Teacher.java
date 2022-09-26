package pojo;

import java.util.Date;

public class Teacher {

    //1.根据表的属性新建对应的属性
    private int id ;
    private String name;;
    private String sex ;
   //extra attribute
    private String experience ; //任职年月
    private String competent ; //职称
    private String password;
    private int employeeNum;


    //2.自动生成对应的getter和setter方法
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCompetent() {
        return competent;
    }

    public void setCompetent(String competent) {
        this.competent = competent;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", experience=" + experience +
                ", competent='" + competent + '\'' +
                ", password='" + password + '\'' +
                ", employeeNum=" + employeeNum +
                '}';
    }
}
