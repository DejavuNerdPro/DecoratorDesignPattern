//this is add-on class / decorator class
public class TalentedHuman extends HumanDecorator {

    public TalentedHuman(Human human) {
        super(human);
    }

    @Override
    public void improveTalency() {
        super.improveTalency();
        System.out.println("Ever try to Concentrate upon the things to learn.");
    }

}
