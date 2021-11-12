
package pkg17123543.lab2;

/**
 *
 * @author Danial Harith 17123543/1
 */
public class StreetRacer extends VehicleSystem {
    
    public StreetRacer() {
        moveBehavior = new Driving();
    }

    @Override
    public void display() {
        System.out.print("I am a StreetRacer. ");
        moveBehavior.move();
    }
    
}
