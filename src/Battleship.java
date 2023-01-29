import static java.lang.Integer.parseInt;

public class Battleship {
    public int[] location;
    public int hits = 0;
    String result = "fallaste";

    public String check(String userShot){
        int i = parseInt(userShot);



            for (int cell : location){
                if (i==cell){
                    result = "en el blanco!";
                    hits++;
                    System.out.println(hits);
                    break;
                }
            }

            if(hits == location.length){
                result = "Has hundido el barco enemigo!";
            }

        System.out.println(result);
        return result;
    }

    public void locationCells(int[] loc){
        location = loc;
    }
}

class BattleshipTest {
    public static void main(String[]args){
        Battleship s = new Battleship();

        int [] location = {2,3,4};
        s.locationCells(location);

        String userShot = "4";
        s.check(userShot);

    }
}
