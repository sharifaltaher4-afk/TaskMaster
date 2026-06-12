import java.util.ArrayList;
import java.util.List;

public class PimManager {
    private final List<PimEintrag> eintraege;
    private final PimRepository repository;

    public PimManager(PimRepository repository){
        this.repository = repository;
        this.eintraege = repository.lade();
    }


    public void fuegeEintrag_hinzu(PimEintrag eintrag){

    }

    public Boolean loescheEintrag(int id){
        return true;
    }

    public List<PimEintrag> holeAlleEintgraege(){
        return null;
    }

    public void speichereDaten(){

    }

    public void ladeDaten(){

    }
}
