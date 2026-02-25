package session04;

public class Lesson02 {
    public static void main(String[] args) {
        String moTa = "Cuốn sách lập trình Java cơ bản, Kệ: A12, dành cho người mới học.";
        if (moTa.contains("Kệ:")) {
            int start = moTa.indexOf("Kệ:") + 4;
            int end;
            if (moTa.indexOf(",", start) != -1) {
                end = moTa.indexOf(",", start);
            } else {
                end = moTa.length();
            }
            String viTri = moTa.substring(start, end).trim();
            System.out.println("Mã vị trí kệ sách: " + viTri);
            String moTaMoi = moTa.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.print("Mô tả sau khi thay thế: ");
            System.out.println(moTaMoi);
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách trong mô tả.");
        }
    }
}
