public class MetoderLiveCode {

    // Instansvariabel.
    // Används senare när vi visar getter, setter och "this".
    private int score;


    public static void main(String[] args) {

        // 1. Anropa en metod
        // Metoden är static, därför behöver vi inget objekt.
        halsa();


        // 2. Metod med parametrar och returvärde
        int summa = add(5, 3);

        System.out.println("Summan är: " + summa);


        // 3. Metoder som tillhör ett objekt
        // Vi skapar ett objekt av klassen.
        MetoderLiveCode demo = new MetoderLiveCode();

        // Punktoperatorn används för att anropa objektets metoder.
        demo.setScore(100);

        System.out.println("Score: " + demo.getScore());


        // 4. Method overloading
        showPower(50);
        showPower("Superstyrka");
    }


    // 1. Void
    // void betyder att metoden inte returnerar något.
    static void halsa() {

        System.out.println("Hej från en metod!");
    }


    // 2. Parametrar + Returvärde
    // int före metodnamnet betyder att metoden
    // returnerar ett heltal.
    static int add(int a, int b) {

        return a + b;
    }


    // 3. Setter
    // Parametern heter också score.
    // this.score betyder objektets instansvariabel.
    void setScore(int score) {

        this.score = score;
    }


    // 4. Getter
    // Returnerar värdet på score.
    int getScore() {

        return score;
    }


    // 5. Method overloading
    // Samma metodnamn...
    static void showPower(int power) {

        System.out.println("Power: " + power);
    }

    // ...men en annan typ av parameter.
    static void showPower(String power) {

        System.out.println("Power: " + power);
    }
}