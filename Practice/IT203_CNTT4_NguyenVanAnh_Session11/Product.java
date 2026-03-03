public abstract class  Product {
    protected String id;
    protected String name;
    protected Double price;

    public Product(String id, String name, double price) {
        if (id == null || name == null) {
            throw new IllegalArgumentException("Id và Name không được null");
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Double calculateFinalPrice();
    public void displayInfo(){
        System.out.println("Mã sản phẩm: "+ id);
        System.out.println("Tên sản phẩm: "+name);
        System.out.println("Giá sản phẩm: "+price);
    }


}
