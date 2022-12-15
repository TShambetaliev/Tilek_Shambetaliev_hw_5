public class Hero {
     private int heroesHealth;
     private int heroesHit;
     private String superpower;

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesHit() {
        return heroesHit;
    }

    public String getSuperpower() {
        return superpower;
    }

    public Hero(int heroesHealth, int heroesHit, String superpower) {
        this.heroesHealth = heroesHealth;
        this.heroesHit = heroesHit;
        this.superpower = superpower;
    }
    public Hero (int heroesHealth, int heroesHit){
        this.heroesHealth = heroesHealth;
        this.heroesHit = heroesHit;
    }
}
