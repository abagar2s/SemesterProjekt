import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PTest {
     private Parkpl_groesse pp1;
     private Preise p1;
	 private FreiPlaetze fp1;

	@BeforeEach
	void setUp() throws Exception {
		pp1=new Parkpl_groesse(20,30,5,50);
		p1=new Preise(3.2, 1.5, 0.95, 1.3);
	}
	
	@Test
	@DisplayName("Alle Plätze")
	void test1() {
		assertEquals(105,pp1.getgesamtepl());
		assertEquals(20,pp1.getfrauen());
		assertEquals(30,pp1.getbehindert());
		assertEquals(5,pp1.getfamilien());
		assertEquals(50,pp1.getrest());

	}

	@Test
	@DisplayName("Preise Test")
	void test2() {
		assertEquals(3.2,p1.getFrauenpreis());
		assertEquals(1.5,p1.getBehindertpreis());
		assertEquals(0.95,p1.getFamilienpreis());
		assertEquals(1.3,p1.getRestpreis());
		p1.setFrauenpreis(5);
		p1.setBehindertpreis(4);
		p1.setFamilienpreis(3);
		p1.setRestpreis(6);
		assertEquals(5,p1.getFrauenpreis());
		assertEquals(4,p1.getBehindertpreis());
		assertEquals(3,p1.getFamilienpreis());
		assertEquals(6,p1.getRestpreis());

	}
	@Test
	@DisplayName("besitzte Plätze Test")
	void test3() {
		pp1.frauenrein();
		pp1.frauenrein();
		pp1.behindertrein();
		pp1.famillienrein();
		pp1.restrein();
		assertEquals(2,pp1.getBfrauen());
		assertEquals(1,pp1.getBbehindert());
		assertEquals(1,pp1.getBfamilien());
		assertEquals(1,pp1.getBrest());
		assertEquals(5,pp1.getBgesamt());
		pp1.frauenraus();
		pp1.frauenraus();
		pp1.behindertraus();
		pp1.famillienraus();
		pp1.restraus();
		assertEquals(0,pp1.getBfrauen());
		assertEquals(0,pp1.getBbehindert());
		assertEquals(0,pp1.getBfamilien());
		assertEquals(0,pp1.getBrest());
		assertEquals(0,pp1.getBgesamt());
	}
	
	@Test
	@DisplayName("freie Plätze Test")
	void test4() {
		fp1=new FreiPlaetze(pp1);
		pp1.frauenrein();
		pp1.frauenrein();
		pp1.behindertrein();
		pp1.famillienrein();
		pp1.restrein();
		assertEquals(18,fp1.FreiPlatzeFrauen());
		assertEquals(29,fp1.FreiPlatzeBehindert());
		assertEquals(4,fp1.FreiPlatzeFamilie());
		assertEquals(49,fp1.FreiPlatzeRest());
		assertEquals(100,fp1.FreiPlatzeGesamt());
		pp1.frauenraus();
		pp1.frauenraus();
		pp1.behindertraus();
		pp1.famillienraus();
		pp1.restraus();
		assertEquals(20,fp1.FreiPlatzeFrauen());
		assertEquals(30,fp1.FreiPlatzeBehindert());
		assertEquals(5,fp1.FreiPlatzeFamilie());
		assertEquals(50,fp1.FreiPlatzeRest());
		assertEquals(105,fp1.FreiPlatzeGesamt());

	}

	
	
	

	
}
