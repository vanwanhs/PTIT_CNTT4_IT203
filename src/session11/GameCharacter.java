package session11;
public abstract class GameCharacter {

    protected String name;
    protected int hp;
    protected int attackPower;

    // Biến static đếm số nhân vật
    public static int count = 0;

    // Constructor
    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    // Nhận sát thương
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        }
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }

    // Mỗi nhân vật đánh khác nhau
    public abstract void attack(GameCharacter target);
}