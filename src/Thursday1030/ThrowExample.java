package Thursday1030;

public class ThrowExample {
    static void main(String[] args) {
        try{
            checkTemperature(-5);
        }catch (Exception e){
            System.out.println("Caught: " + e.getMessage());
        }
    }
    public static void checkTemperature(int temp){
        if (temp < 0){
            throw new IllegalArgumentException("Too cold! Temp: " + temp);
        }
    }
}
