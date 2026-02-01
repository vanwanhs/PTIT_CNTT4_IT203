package session06.lesson01;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Students sv1 = new Students("SV01", "Nguyễn Văn Ánh", new Date(2006 - 1900, 0, 1), 3.8);
        Students sv2 = new Students("SV02", "Nguyễn Văn Ánh2", new Date(2006 - 1900, 5, 15), 4.0);
        sv1.display();
        sv2.display();
    }

}
