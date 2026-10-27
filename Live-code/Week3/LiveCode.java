import java.util.Arrays; // Behövs för Arrays.sort() och Arrays.toString().

public class LiveCode {

    // ENUM: En egen typ med en bestämd uppsättning tillåtna värden.
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    public static void main(String[] args) {

        // ARRAY: Lagrar flera värden av samma typ.
        int[] nummer = {30, 10, 20};




        // INDEX: Börjar på 0. nummer[0] är första elementet.
        System.out.println("INDEX:                          Första talet: " + nummer[0]);



        // ÄNDRA VÄRDE: Vi använder index och tilldelningsoperatorn =.
        nummer[1] = 50;




        // LENGTH: Antalet element i arrayen (här 3).
        System.out.println("LENGTH:                         Antal tal: " + nummer.length);



        // VANLIG FOR-LOOP: Använder index för att läsa varje element.
        for (int i = 0; i < nummer.length; i++) {
            System.out.println("VANLIG FOR-LOOP:                " + nummer[i]);
        }



        // ENHANCED FOR-LOOP: Läser alla värden utan att skriva index.
        for (int tal : nummer) {
            System.out.println("ENHANCED FOR-LOOP:              Tal: " + tal);
        }



   
        // ARRAYS-KLASSEN: sort sorterar och toString skriver ut innehållet.
        Arrays.sort(nummer);
        System.out.println("SORTERING:                      " + Arrays.toString(nummer));



        // TVÅDIMENSIONELL ARRAY: En array som innehåller andra arrayer.
        int[][] rutnat = new int[2][2];
        rutnat[0][1] = 7; // Första raden, andra kolumnen.
        System.out.println("TVÅDIMENSIONELL ARRAY:          Ruta: " + rutnat[0][1]);




        // ENUM: Variabeln får bara ett värde som finns i Direction.
        Direction riktning = Direction.NORTH;



        // SWITCH: Välj vad som ska hända utifrån enum-värdet.
        switch (riktning) {
            case NORTH:
                System.out.println("SWITCH:                         Du går norrut");
                break;
            default:
                System.out.println("SWITCH:                 Du går åt ett annat håll");
        }



        // values(): Ger alla värden i vår enum.
        for (Direction d : Direction.values()) {
            System.out.println("VALUES:                         " + d);
        }
    }
}
