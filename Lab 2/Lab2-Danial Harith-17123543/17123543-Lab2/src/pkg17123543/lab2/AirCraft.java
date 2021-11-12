
package pkg17123543.lab2;

/**
 *
 * @author Danial Harith 17123543/1
 */
public class AirCraft extends VehicleSystem {

    public AirCraft() {
        moveBehavior = new Flying();
    }
    
    @Override
    public void display() {
        System.out.print("I am an AirCraft. ");
        moveBehavior.move();
    }
    
}
