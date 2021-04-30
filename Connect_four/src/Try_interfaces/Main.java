package Try_interfaces;

public class Main {
    public static void main(String[] args) {
        Animals pluto = new Dog();

        pluto.setName("Pluto");
        pluto.setNoise("woof");

        System.out.println(pluto.getName() + " " + pluto.getNoise());

        Check c = new Check(pluto);
    }
}
