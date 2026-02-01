package session06.lesson01;

import java.util.Date;

public class Students {
    private String studentId;
    private String fullName;
    private Date birthday;
    private double avgMark;

    public Students(String studentId, String fullName, Date birthday, double avgMark) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthday = birthday;
        this.avgMark = avgMark;
    }

    public void display(){
        System.out.println("Mã số sinh viên " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Ngày sinh: " + birthday);
        System.out.println("Điểm trung bình: "+ avgMark);
    }
}
