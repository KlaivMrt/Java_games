package Try_interfaces;

public class Check {
    String name;
    String noise;

    Check(Animals animal){
        name = animal.getName();
        noise = animal.getNoise();
        System.out.println(name + noise);
    }



}
