
void main() throws InterruptedException {
    ArrayList<Aufgabe> liste_der_Aufgaben = new ArrayList<>();
    while (true){
        Scanner lese_object = new Scanner(System.in);
        System.out.println("1. Aufgabe Hinzufügen");
        System.out.println("2. Aufgabe anzeigen");
        System.out.println("3. Als erledigt makieren");
        System.out.println("4. Aufgabe löschen");
        System.out.println("5. beenden");
        int nummer_der_Wahl = lese_object.nextInt();
        switch (nummer_der_Wahl){
            case 1:
                System.out.println("Aufgabe hinzugefügt.\n");
                break;
            case 2:
                System.out.println("Aufgabe angezeigt.\n");
                break;
            case 3:
                System.out.println("Aufgabe als erledigt makiert.\n");
                break;
            case 4:
                System.out.println("Aufgabe gelöscht. \n");
                break;
            case 5:
                System.out.println("Programm beendet.");
                System.exit(0);
            default:
                break;
        }
    }
}
