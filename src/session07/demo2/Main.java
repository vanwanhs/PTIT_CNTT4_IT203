package session07.demo2;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(1,"Hoa Hồng Nhung", "CNTT4" );
        Flower flower1 = new Flower(2,"Hoa Tulip", "Janpan" );
        Flower flower2 = new Flower(3,"Hoa Sen", "Việt Nam" );
        Flower flower3 = new Flower(4,"Sunflower", "USA" );
        Flower flower4 = new Flower(5,"orchid", "ThaiLand" );
        FlowerManager.addFlower(flower);
        FlowerManager.addFlower(flower1);
        FlowerManager.addFlower(flower2);
        FlowerManager.addFlower(flower3);
        FlowerManager.addFlower(flower4);
        System.out.println("============================");
        FlowerManager.showAllFlowers();
        System.out.println("=================");
        FlowerManager.findFlowerById(3);
        if(true){
            System.out.println("Tìm thấy thành công");
        }else{
            System.out.println("Không tìm thấy ");
        }
    }
}
