import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int shotNumber = 0;
        Battleship s = new Battleship();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int starting = rand.nextInt(1 * 4);
        int starting2 = starting +1;
        int starting3 = starting2 +1;
        int [] location = {starting,starting2,starting3};
        for (int element: location) {
            System.out.println(element);
        }
        s.locationCells(location);



        boolean on = true;

        while(on){
            System.out.println("Prepara tus cañones!");
            System.out.println("ingresa coordenada:");
            String userShot = scan.nextLine();
            System.out.println("Disparaste a cuadrante : " +userShot);
            s.check(userShot);
            shotNumber++;
            if(s.result == "Has hundido el barco enemigo!"){
                on = false;
                System.out.println("Numero de disparos : " + shotNumber);
            }
        }
    }
}