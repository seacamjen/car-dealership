import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    Vehicle hatchback = new Vehicle();
    hatchback.mYear = 1994;
    hatchback.mBrand = "Subaru";
    hatchback.mModel = "Legacy";
    hatchback.mMiles = 170000;
    hatchback.mPrice = 4000;

    Vehicle suv = new Vehicle();
    suv.mYear = 2002;
    suv.mBrand = "Ford";
    suv.mModel = "Explorer";
    suv.mMiles = 100000;
    suv.mPrice = 7000;

    Vehicle sedan = new Vehicle();
    sedan.mYear = 2015;
    sedan.mBrand = "Toyota";
    sedan.mModel = "Camry";
    sedan.mMiles = 50000;
    sedan.mPrice = 30000;

    Vehicle truck = new Vehicle();
    truck.mYear = 1999;
    truck.mBrand = "Ford";
    truck.mModel = "Ranger";
    truck.mMiles = 100000;
    truck.mPrice = 4000;

    Vehicle crossover = new Vehicle();
    crossover.mYear = 1998;
    crossover.mBrand = "Toyota";
    crossover.mModel = "Rav-4";
    crossover.mMiles = 200000;
    crossover.mPrice = 3500;

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};

    System.out.println("What is your maximum budget for a vehicle?");
    int userMaxBudget = Integer.parseInt(console.readLine());

    System.out.println("All Vehicles:");

    for ( Vehicle individulVehicle : allVehicles ) {
      if (individulVehicle.worthBuying(userMaxBudget)){
        System.out.println( "-------------------");
        System.out.println( individulVehicle.mYear );
        System.out.println( individulVehicle.mBrand );
        System.out.println( individulVehicle.mModel );
        System.out.println( individulVehicle.mMiles );
        System.out.println( individulVehicle.mPrice );
      }
    }
  }
}
