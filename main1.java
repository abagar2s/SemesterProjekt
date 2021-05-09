public class main1 {
    public static void main(String[] args) {
        Parkpl_groesse pp1=new Parkpl_groesse(10, 20, 30,40);
        System.out.println(pp1.getfrauen());
        System.out.println(pp1.getbehindert());
        System.out.println(pp1.getfamilien());
        System.out.println(pp1.getrest());
        System.out.println(pp1.getgesamtepl());
        System.out.println("\n");

        pp1.frauenrein();
        pp1.frauenrein();
        System.out.println(pp1.getBfrauen());
        System.out.println("\n");
        FreiPlaetze fp=new FreiPlaetze(pp1);
        System.out.println(fp.FreiPlatzeFrauen());

        pp1.frauenraus();
        System.out.println(fp.FreiPlatzeFrauen());


    }
    
}
