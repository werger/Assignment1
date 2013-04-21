
public class City extends AtomicRegion {

	private String mayor = "";
	
	public City(String name) {
		
		this.setName(name);
	}

	public String getMayor() {
		
		return mayor;
	}

	public void setMayor(String mayor) {
		
		this.mayor = mayor;
	}
	
	public String toString(){
		
		return "Name " + this.getName() + " Mayor " + this.getMayor() + " Population " + this.getPopulation() + " Area " + this.getArea();
	}

}
