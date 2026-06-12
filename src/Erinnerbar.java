import java.time.LocalDateTime;

public interface Erinnerbar {
    public LocalDateTime getErinnerungsZeitpunkt();
    public Boolean checkErinnerung();
}
