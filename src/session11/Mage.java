package session11;

public class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    // Đánh thường
    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Pháp sư] " + name + " tấn công " + target.getName());

        if (mana >= 5) {
            mana -= 5;
            target.takeDamage(attackPower);
        } else {
            target.takeDamage(attackPower / 2);
        }
    }

    // Chiêu cuối
    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            System.out.println("[Pháp sư] " + name + " dùng chiêu cuối: HỎA CẦU!");
            mana -= 50;
            target.takeDamage(attackPower * 3);
        } else {
            System.out.println(name + " không đủ mana!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}