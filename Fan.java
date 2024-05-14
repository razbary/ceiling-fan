import java.time.LocalDate;

public class Fan {
    
    int speed;
    boolean reversed;
    LocalDate today;

    public Fan() {
    this.speed = 0;
    this.reversed = false;
    this.today = LocalDate.now();
    }

    public boolean isChristmas() {
        if (today.getMonthValue() == 12 && today.getDayOfMonth() == 25) {
            return true;
        }
        else return false; 
    }

    public int pullSpeedCord() {
        if (isChristmas()) { // christmas check
            return speed = 0;
        }
        else {  
            if (speed == 3) {
                return speed = 0;
            }
            else {
                return speed++; 
            }   
        }
    }

    public boolean pullReverseCord() {
        if (isChristmas()) { // christmas check
            return reversed;
        }
            else { 
            if (reversed == false) {
                return reversed = true;
            }
            else {
                return reversed = false;
            }
        }
    }

    public void displayStatus(LocalDate currentDate) { // display status of the fan
        System.out.println("Current Date: " + today);
        System.out.println("Speed: " + speed);
        System.out.println("Reversed?: " + reversed);
    }

    public static void main(String[] args) {
        Fan fan = new Fan(); // run area
        fan.displayStatus(fan.today);
        fan.pullSpeedCord();
        fan.pullSpeedCord();
        fan.pullReverseCord();
        fan.pullSpeedCord();
        fan.displayStatus(fan.today);
    }
}