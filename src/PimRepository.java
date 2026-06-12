import java.util.List;

public interface PimRepository {
    public void speichere(List<PimEintrag> eintraege);
    public List<PimEintrag> lade();
}
