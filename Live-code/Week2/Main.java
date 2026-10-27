public class Main {

    public static void main(String[] args) {

        // Två OBJEKT skapade från samma klass.
        // Djur = referenstypen
        // hund = variabelnamnet
        // new Djur("Voff") = skapar ett nytt Djur-objekt
        // "Voff" = argumentet som skickas till konstruktorn
        // Referensen till det nya objektet sparas i variabeln hund.
        Djur hund = new Djur("Voff"); // Steg 1
        Djur katt = new Djur("Mjau");
        

        // Samma metod, men olika resultat eftersom objekten har olika state.
        hund.gorLjud(); // Steg 3
        katt.gorLjud();
    }
}