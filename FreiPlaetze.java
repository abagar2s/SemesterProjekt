public class FreiPlaetze implements FreiPlaetzeIF {
    Parkpl_groesse a;
    public FreiPlaetze(Parkpl_groesse a){
        this.a=a;
    }

    public int FreiPlatzeFrauen(){
		return a.getfrauen()-a.getBfrauen();
	}
    @Override
	public int FreiPlatzeBehindert(){
		return a.getbehindert()-a.getBbehindert();
	}
	@Override
	public int FreiPlatzeFamilie(){
		return a.getfamilien()-a.getBfamilien();
	}
	@Override
	public int FreiPlatzeRest(){
		return a.getrest()-a.getBrest();
	}
	@Override
	public int FreiPlatzeGesamt(){
		return a.getgesamtepl()-a.getBgesamt();
	}
}
