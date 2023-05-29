public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Decorator Design Pattern!");

        // Authentic Human : the original class
        AuthenticHuman authenticHuman = new AuthenticHuman();
        authenticHuman.improveTalency();

        // The add-on class
        Human talentedHuman = new TalentedHuman(authenticHuman);
        // or Hman talentedHuman=new TalentedHuman(new AuthenticHuman());
        talentedHuman.improveTalency();

    }
}
