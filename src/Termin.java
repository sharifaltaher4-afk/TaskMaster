import java.time.LocalDateTime;

public class Termin extends PimEintrag implements Erinnerbar{
    LocalDateTime startZeit;
    LocalDateTime endZeit;
    String beschreibung;
    String ort;

    @Override
    public LocalDateTime getErinnerungsZeitpunkt() {
        return null;
    }

    @Override
    public Boolean checkErinnerung() {
        return null;
    }
}
