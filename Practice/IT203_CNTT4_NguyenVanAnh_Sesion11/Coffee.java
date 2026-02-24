package IT203_CNTT4_NguyenVanAnh_Sesion11;

public class Coffee extends Drink {

    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public Double calculatePrice() {
        if (hasMilk) {
            return price + 5000;
        }
        return price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (hasMilk) {
            System.out.println("Loại: Có sữa");
        } else {
            System.out.println("Loại: Đen đá");
        }
    }
}
