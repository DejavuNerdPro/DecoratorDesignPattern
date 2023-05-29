public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Decorator Design Pattern!");

        // Authentic Human : the original class
        AuthenticHuman authenticHuman = new AuthenticHuman();
        authenticHuman.improveTalency();

        System.out.println("------");

        // The add-on class
        Human talentedHuman = new TalentedHuman(authenticHuman);
        // or Hman talentedHuman=new TalentedHuman(new AuthenticHuman());
        talentedHuman.improveTalency();

        System.out.println("-------");

        // The add-on class 2
        Human brillientHuman = new BrillientHuman(new TalentedHuman(new AuthenticHuman()));
        brillientHuman.improveTalency();

        System.out.println("-------");

    }
}
