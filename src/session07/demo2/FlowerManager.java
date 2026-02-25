package session07.demo2;

public class FlowerManager {
    private static Flower[] flower = new Flower[100];
    private static int count = 0;
    public static int flag = -1;
    public static void addFlower(Flower f){
        if(count < flower.length){
            flower[count ++] = f;
            System.out.println("Thêm hoa thành công");
        } else {
            System.out.println("Danh sách đã đầy");
        }
    }
    public static void showAllFlowers(){
        if(flower.length == 0){
            System.out.println("Danh sách trống");
            return;
        }
        for (int i = 0; i < count; i++){
            flower[i].display();
        }
    }
    public static Flower findFlowerById(int id){
        for(int i = 0; i< count ; i++){
            if(flower[i].getId() == id){
                flag = i;
                System.out.println("loài hao ở vị trí "+ flag);
            }
        }
        return null;
    }
}
