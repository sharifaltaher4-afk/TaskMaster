import java.util.ArrayList;
import java.util.List;

public class JsonPimRepository implements PimRepository{
    private String dateipfad="Pafd/zu/der/Josn/";
    public  JsonPimRepository(String dateipfad){
        this.dateipfad= dateipfad;
    }

    @Override
    public void speichere(List<PimEintrag> eintraege) {
        // hier kommt der Code, um die Liste in eine JSON-Datei zu schreiben
        System.out.println("Speichere Daten als JSON in: " + dateipfad);
    }

    @Override
    public List<PimEintrag> lade() {
        // Hier der Code, um die JSON-Datei auszulesen
        System.out.println("Lade Daten aus JSON-Datei.");
        return new ArrayList<>();
    }

}
