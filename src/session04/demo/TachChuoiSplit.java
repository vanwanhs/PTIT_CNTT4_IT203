package session04.demo;

public class TachChuoiSplit {
    public static void main(String[] args) {
        String name = "Tách   chuỗi bảng    phương thức split()";
        String[] arr = name.split(" ");
        System.out.println("Tách chuỗi");
        for(String x: arr){
            System.out.println(x);
        }
    }
}
