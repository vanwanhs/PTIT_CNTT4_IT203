package session11;

public class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    // Đánh thường
    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " tấn công " + target.getName());
        target.takeDamage(attackPower);
    }

    // Nhận sát thương có trừ giáp
    @Override
    public void takeDamage(int damage) {
        int realDamage = damage - armor;
        if (realDamage < 0) realDamage = 0;
        super.takeDamage(realDamage);
    }

    // Chiêu cuối
    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " dùng chiêu cuối: ĐẤM NGÀN CÂN!");
        target.takeDamage(attackPower * 2);

        // Tự mất 10% máu
        hp -= hp * 0.1;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}