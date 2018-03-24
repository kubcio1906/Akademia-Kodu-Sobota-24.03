import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {

    public static void start(){
        boolean exitFlag =false;
do {
    System.out.println();
    System.out.println("--------------------------");
    System.out.println();
    int choice = Menu.MainScreen();

    switch (choice) {
        case 1:
            typeCarFlow();
            break;
        case 2:
            System.out.println();
            System.out.println("--------------------------");
            System.out.println();
            CarRepository.showCars();

            break;
        case 3:
            exitFlag = true;

    }
}while (!exitFlag);
    System.exit(0);

    }
    private static void typeCarFlow(){
        int choice = Menu.carTypeScreen();
        CarDataWrapper cdw;
        Scanner scanner = new Scanner(System.in);
        switch(choice){
            case 1:
                 cdw=readMainParameters();

                System.out.println("Seat numbers: ");
                int seats = scanner.nextInt();
                FamilyCar fc = new FamilyCar(cdw , seats);
                break;
            case 2:
                cdw = readMainParameters();
                System.out.println("Seat numbers: ");
                int seatsNumbers = scanner.nextInt();
                System.out.println("Standing places: ");
                int standingPlaces = scanner.nextInt();
                System.out.println("Length: ");
                double length = scanner.nextDouble();
                System.out.println("Height: ");
                double height = scanner.nextDouble();

                Bus b = new Bus(cdw, seatsNumbers, standingPlaces, length, height);
                break;
        }

    }
    private static CarDataWrapper readMainParameters(){
        CarDataWrapper carDataWrapper = new CarDataWrapper();

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Brand: ");
            carDataWrapper.brand = scanner.nextLine();
             System.out.print("Model: ");
            carDataWrapper.model = scanner.nextLine();
             System.out.print("Color: ");
             carDataWrapper.color = scanner.nextLine();

            carDataWrapper.power= ourScanner("Power");
             carDataWrapper.engineCapasity= ourScanner("engine capacity");
              carDataWrapper.fuelConsumtion= ourScanner("fuel consuption");
              scanner.nextLine();
             System.out.print("Registration number: ");
         carDataWrapper.registrationNumber= scanner.nextLine();
        } catch (InputMismatchException e){
            System.out.println("Zepsuło sie!");
            System.exit(0);
        }


        return carDataWrapper;


    }
    public static  int ourScanner(String parameterName){
            int result = 0;
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(parameterName + ": ");
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Zepsulo sie");
                continue;
            }
            break;
        }
        return result;

            }
        }


