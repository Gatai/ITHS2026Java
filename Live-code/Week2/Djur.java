// Djur är vår mall/KLASS. Public används för att klassen ska kunna användas i andra filer.
public class Djur {

    // Alla djur har ett ljud.
    // "Ljud" är en field / instansvariabel.
    // Varje objekt som skapas får sin egen uppsättning av dessa variabler.
    String ljud;


    // Konstruktorn körs när ett nytt Djur-objekt skapas.
    // Den tar emot ett ljud som parameter.
    Djur(String ljud) { //Steg 2

        // Objektets egen variabel "ljud" får värdet som skickades in till konstruktorn.
        this.ljud = ljud;
    }



    // En METOD (funktion) beskriver något som objektet kan göra.
    void gorLjud() { // Steg 4
        System.out.println(ljud);
    }
    
}