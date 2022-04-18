public class MasinaSport implements Automobil {

    private String eleron;

    public MasinaSport(String eleron) {
        this.eleron = eleron;
    }

    @Override
    public String getDescriere() {
        return "Masina Sport are " + eleron;
    }
}
