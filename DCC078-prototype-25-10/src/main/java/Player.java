public class Player implements Cloneable {
    private String name;
    private float hp;
    private int damage;

    public Player(String name, float hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public Player clone() throws CloneNotSupportedException {
        return (Player) super.clone();
    }

   public String toString(){
        return "Player{ " +
                "Name: " + this.name +
                " / HP: " + this.hp +
                " / Damage: " + this.damage +
                " }";
   }
}
