public class Boss {
    private int bossHealth;
    private int bossHit;
    private String bossDefence;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        if (bossHealth <= 0) {
            System.out.println("Age must be positive number");
        } else {
        this.bossHealth = bossHealth; }
    }

    public int getBossHit() {
        return bossHit;
    }

    public void setBossHit(int bossHit) {
        if (bossHit <= 0) {
            System.out.println("Age must be positive number");
        } else {
        this.bossHit = bossHit;}
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    public Boss (int bossHealth, int bossHit, String bossDefence){
        this.bossHealth = bossHealth;
        this.bossHit = bossHit;
        this.bossDefence = bossDefence;
    }
}
