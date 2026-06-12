import java.time.LocalDateTime;

public class Aufgabe extends PimEintrag implements Erinnerbar{
    String beschreibung;
    Boolean istErledigt;
    LocalDateTime frit;
    int prioritaet;


    @Override
    public LocalDateTime getErinnerungsZeitpunkt() {
        return null;
    }

    @Override
    public Boolean checkErinnerung() {
        return null;
    }
}
