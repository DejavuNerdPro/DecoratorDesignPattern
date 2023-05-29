public class HumanDecorator implements Human {
    protected Human human;

    // Contructor
    public HumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    public void improveTalency() {
        this.human.improveTalency();
    }
}
