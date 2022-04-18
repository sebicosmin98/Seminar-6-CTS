public class MasinaElectrica implements Automobil {

    private String incarcator;

    public MasinaElectrica(String incarcator) {
        this.incarcator = incarcator;
    }

    @Override
    public String getDescriere() {
        return "Masina Electrica are " + this.incarcator;
    }
}
