public class Auto {
    public String znacka;
    public int vykon;
    public int aktRychlost;

    void pridaj() {
        aktRychlost++;
    }

    void brzdi() {
        aktRychlost--;
    }

    void zobraz() {
        Auto auto = new Auto();
    }
}

class Hlavna {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.zobraz();
    }
}
