
public class Parkpl_groesse implements Parkpl_groesseIF {
	//Die Größe von dem Parkplatz
	private int frauen;
	private int behindert;
	private int familien;
	private int rest;
	private int gesamt;

	//Die besetzte Plätze
	private int bfrauen=0;
	private int bbehindert=0;
	private int bfamilien=0;
	private int brest=0;
	private int bgesamt=bfrauen+bbehindert+bfamilien+brest;

	//konstruktor
	public Parkpl_groesse(int f, int b, int fa,int r) {
		this.frauen=f;
		this.behindert=b;
		this.familien=fa;
		this.rest=r;
		this.gesamt=this.frauen+this.behindert+this.familien+this.rest;				
	}

	//getter
	
	public int getgesamtepl() {
		return this.gesamt;
	}

	public int getfrauen() {
		return this.frauen;
	}

	public int getbehindert() {
		return this.behindert;
	}

	public int getfamilien() {
		return this.familien;
	}

	public int getrest() {
		return this.rest;
	}
	
	public int getBfrauen() {
		return bfrauen;
	}
	
	public int getBbehindert() {
		return bbehindert;
	}

	public int getBfamilien() {
		return bfamilien;
	}

	public int getBrest() {
		return brest;
	}

	public int getBgesamt() {
		bgesamt=getBfrauen()+getBbehindert()+getBfamilien()+getBrest();
		return bgesamt ;
	}

	//inkrement von besetzte Plätze
	@Override

	public int frauenrein () {
		return bfrauen++;
	}
	@Override
	
	public int behindertrein () {
		return bbehindert++ ;
	}
	@Override

	public int famillienrein () {	
		return bfamilien++;
	}
	@Override
	
	public int restrein () {
		return brest++;
	}
	//dekrement von besetzte Plätze
	@Override
	public int frauenraus () {
		return bfrauen--;
	}
	@Override
   	public int behindertraus () {
		return bbehindert-- ;
	}
	@Override
	
	public int famillienraus () {	
		return bfamilien--;
	}
	@Override

	public int restraus () {
		return brest--;
	}
	// freie plätze rechnen
	@Override
	public int FreiPlatzeFrauen(){
		return frauen-bfrauen;
	}
	@Override
	public int FreiPlatzeBehindert(){
		return behindert-bbehindert;
	}
	@Override
	public int FreiPlatzeFamilie(){
		return familien-bfamilien;
	}
	@Override
	public int FreiPlatzeRest(){
		return rest-brest;
	}
	@Override
	public int FreiPlatzeGesamt(){
		return gesamt-getBgesamt();
	}

}
