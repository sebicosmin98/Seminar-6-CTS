public class MasinaDeFamilie implements Automobil {

    public String scaunCopil;

    public MasinaDeFamilie(String scaunCopil) {
        this.scaunCopil = scaunCopil;
    }

    @Override
    public String getDescriere() {
        return "Masina de familie are " + this.scaunCopil;
    }
}
