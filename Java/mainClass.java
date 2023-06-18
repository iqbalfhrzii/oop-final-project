package Java;

public class mainClass {
    public static void main(String[] args) {
        Time1 time = new Time1();
        TimeTest.displayTime("After Time object is created", time);
        System.out.println();
        
        time.setTime(13,27,6);
        TimeTest.displayTime("After calling setTime", time);
        System.out.println();

        try{
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception : %s%n%n", e.getMessage());
        }

        TimeTest.displayTime("After calling SetTime with invalid values", time);
    }
    
}
