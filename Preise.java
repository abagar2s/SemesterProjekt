public class Preise {
    private double frauenpreis;
	private double behindertpreis;
	private double familienpreis;
	private double restpreis;

    public Preise(double f, double b, double fa,double r){
        this.frauenpreis=f;
        this.behindertpreis=b;
        this.familienpreis=fa;
        this.restpreis=r;
    }

    public double getFrauenpreis() {
        return frauenpreis;
    }
    
    public double getBehindertpreis() {
        return behindertpreis;
    }

    public double getFamilienpreis() {
        return familienpreis;
    }

    public double getRestpreis() {
        return restpreis;
    }

    public void setFrauenpreis(double frauenpreis) {
        this.frauenpreis = frauenpreis;
    }

    public void setBehindertpreis(double behindertpreis) {
        this.behindertpreis = behindertpreis;
    }

    public void setFamilienpreis(double familienpreis) {
        this.familienpreis = familienpreis;
    }

    public void setRestpreis(double restpreis) {
        this.restpreis = restpreis;
    }
    
}