package Try_interfaces;

public class Dog implements Animals {
    private String name;
    private String noise;

    Dog(){
        name = null;
        noise = null;
    }

    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public String getNoise() {
        return this.noise;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
