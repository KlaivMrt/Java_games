package Try;

public class Superman {

    private boolean sidek;
    private boolean trainee;
    private boolean fly;
    private boolean superstrength;
    String name;

    public Superman(){
        fly = true;
        superstrength = true;
        sidek = false;
        trainee =false;
        name = null;
    }

    public void Introduce(){
        System.out.println("Hello folks");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTraineeTrue(){
        trainee = true;
    }

    public boolean getTrainee(){
        return trainee;
    }

    public void setSidekTrue() {
        sidek = true;
    }

    public boolean getSidek(){
        return sidek;
    }
}
