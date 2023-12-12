public class Player {
    String name;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", die=" + die +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDie(int die) {
        this.die = die;
    }

    public String getName() {
        return name;
    }

    public int getDie() {
        return die;
    }

    public Player(String name, int die) {
        this.name = name;
        this.die = die;
    }

    int die;
}
