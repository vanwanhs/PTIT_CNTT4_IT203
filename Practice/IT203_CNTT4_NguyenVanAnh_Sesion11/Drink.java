package IT203_CNTT4_NguyenVanAnh_Sesion11;

public abstract class Drink {
    protected String id;
    protected String name;
    protected double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public abstract Double calculatePrice();
    public void displayInfo(){
        System.out.println("Mã đồ uống: " + id);
        System.out.println("Tên đồ uống: " + name);
        System.out.println("Giá đồ uống " + price);
    }
}
