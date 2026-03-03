public class FoodProduct extends Product{
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    public Double calculateFinalPrice(){
        return price - (price * discountPercent/100);
    }
    @Override
    public void displayInfo(){
        System.out.println("Phần trăm giảm giá: "+discountPercent+"%");
    }
}
