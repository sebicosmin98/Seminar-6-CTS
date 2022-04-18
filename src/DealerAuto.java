public class DealerAuto {

    public MasinaDeFamilie mf = null;
    public MasinaSport ms = null;
    public MasinaElectrica me = null;

    public DealerAuto() {


    }

    public String getDescriereMasinaDeFamilie(){

        if(this.mf == null){

            this.mf = new MasinaDeFamilie("Scaun Alb");
        }
        else{

            return mf.getDescriere();
        }

        return mf.getDescriere();
    }

    public String getDescriereMasinaSport(){

        if(this.ms == null){

            this.ms = new MasinaSport("Eleron Mare");
        }
        else{

            return ms.getDescriere();
        }

        return ms.getDescriere();
    }


    public String getDescriereMasinaElectrica(){

        if(this.me == null){

            this.me = new MasinaElectrica("Incarcator1");
        }
        else{

            return me.getDescriere();
        }

        return me.getDescriere();
    }


}
