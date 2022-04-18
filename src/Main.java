public class Main {


                                                            // Facade

    // inseamna ca utilizatorul final va avea acces limitat la anumite functionalitati

    // exemplu:
    // o persoana vrea sa si cumpere o anumita masina si are nevoie de informatii despre masini
    // ar fi o varianta costisitoare sa se duca la fiecare brand sa intrebe de informatii
    // insa putem sa avem o reprezentanta Auto care sa furnizeze informatiile intr-un format simplu catre client fara sa-i toate toate detaliile

    // avem o interfata Automobil
    // ea are o metoda getDescriere() care returneaza String, ofera informatiile despre un automobil

    // avem un client care sa zicem ca e interesat de 3 tipuri de masini: MasinaDeFamilie, MasinaSport, MasinaElectrica
    // clasa MasinaDeFamilie va avea un camp scaunCopil
    // clasa MasinaSport va avea un camp eleron
    // clasa MasinaElectrica va avea un camp incarcator
    // toate acestea sunt 3 clase care vor implementa interfata si voir supradefinii metoda getDescriere() folosind campul specific

    // avem nevoie si de clasa de tip facade DelearAuto
    // aceasta va contine un camp din fiecare clasa (HAS A) egale cu null initial
    // va avea doar un constructor fara parametrii
    // va avea o metoda getDescriereMasinaDeFamilie() care va instantia campul de tipul MasinaDeFamilie daca e null campul, altfel returnam metoda getDescriere din clasa respectiva
    // va avea o metoda getDescriereMasinaSport()...
    // va avea o metoda getDescriereMasinaElectrica()...

    // in Main vom instantia clasa DealerAuto da = new DealerAuto()
    // apelam pe obiectul da metodele getDescriereMasinaDeFamilie() etc..


    public static void main(String[] args){

        DealerAuto dealerAuto = new DealerAuto();
        System.out.print(dealerAuto.getDescriereMasinaDeFamilie());
        System.out.println();
        System.out.print(dealerAuto.getDescriereMasinaSport());
        System.out.println();
        System.out.print(dealerAuto.getDescriereMasinaElectrica());















    }

}
