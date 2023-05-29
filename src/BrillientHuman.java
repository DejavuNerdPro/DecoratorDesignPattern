public class BrillientHuman extends HumanDecorator {

    public BrillientHuman(Human human) {
        super(human);
    }

    @Override
    public void improveTalency() {
        super.improveTalency();
        System.out.println("High Concentration upon the things to learn.");
    }

}
