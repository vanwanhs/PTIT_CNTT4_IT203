package session07.demo2;

public class Flower {
    private final int id;
    private  String name;
    private String from;

    public Flower(int id, String name, String from) {
        this.id = id;
        this.name = name;
        this.from = from;
    }

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    public void display(){
        System.out.println("id loài hoa " + id);
        System.out.println("Tên loài hoa: " + name);
        System.out.println("Loài hoa: " + from);
    }
}
