import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Boss b1 = new Boss(1000, 50, null);
        System.out.println("Boss health: " + b1.getBossHealth() + ", Boss hit: " + b1.getBossHit() + ", Boss defence: "
                + b1.getBossDefence());

        Hero[] massHeroes = createHeroes();
        for (int i = 0; i < 3; i++) {
            System.out.println("Hero health: " + massHeroes[i].getHeroesHealth() + " Hero hit: " + massHeroes[i].getHeroesHit()
                    + " Hero superpower: " + massHeroes[i].getSuperpower());
        }
    }
        public static Hero[] createHeroes () {
            Hero physical = new Hero(250, 20);
            Hero magical = new Hero(220, 22, "magic");
            Hero kinetic = new Hero(230, 21);
            Hero[] createHeroes = {physical, magical, kinetic};
            return createHeroes;
        }
    }

