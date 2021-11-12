
package pkg17123543.lab2;

import java.util.Scanner;

/**
 *
 * @author Danial Harith 17123543/1
 */
public abstract class VehicleSystem {
    
    MoveBehavior moveBehavior;
    
    public void move() {
        moveBehavior.move();
    }
    
    public void setMoveBehavior(MoveBehavior mb) {
        moveBehavior = mb;
    }
    
    public abstract void display();
    
    
    public static void main(String[] args) {
        
        VehicleSystem street = new StreetRacer();
        VehicleSystem formula = new FormulaOne();
        VehicleSystem aircraft = new AirCraft();
        
        Scanner sc = new Scanner(System.in, "UTF-8");
        
        while (true) {
            System.out.println("Type 1 for StreetRacer, 2 for FormulaOne, 3 for"
                    + " Aircraft, 4 to exit:");
            int choice = sc.nextInt();
            VehicleSystem selectedVehicle = null;
            if (choice == 1)
                selectedVehicle = street;
            else if (choice == 2) 
                selectedVehicle = formula;
            else if (choice == 3) 
                selectedVehicle = aircraft;
            else if (choice == 4) 
                return;
            else {
                System.out.println("Invalid choice. Try again");
                continue;
            }
            
            selectedVehicle.display();
            
            while(true) {
                System.out.println("\nType 1 if you want me to drive, 2 to fly,"
                        + " 3 to exit choosing my moving behavior:");
                int selectMove = sc.nextInt();
                if (selectMove == 1)
                    selectedVehicle.setMoveBehavior(new Driving());
                else if (selectMove == 2)
                    selectedVehicle.setMoveBehavior(new Flying());
                else if (selectMove == 3)
                    break;
                else {
                    System.out.println("Invalid choice of moving behavior. "
                            + "Try again");
                    continue;
                }
                
                selectedVehicle.display();
            }
        }
    }
}