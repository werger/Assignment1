
public class driver {

	public static void main(String[] args) {
		City Boston = new City("Boston");
		Boston.setPopulation(1001);
		Boston.setArea(5000);
		Boston.setMayor("Big Mac");
		
		State MA = new State("Mass");
		City Cambridge = new City("Cambridge");
		Cambridge.setPopulation(500);
		Cambridge.setArea(2000);
		MA.Addregion(Cambridge);
		MA.Addregion(Boston);
		MA.setGovenor("Devin");
		Cambridge.setMayor("Ryan");
		
		Country USA = new Country("USA");
		USA.setPopulation(10000);
		USA.setArea(10000);
		USA.Addregion(MA);
		USA.setPresident("Joe");
		
		
		
		System.out.println(Boston);
		System.out.println(USA);
		System.out.println(MA);
		System.out.println(Cambridge);
		

		
	}

}
