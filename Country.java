
public class Country extends ContainerRegion{

	private String president = "";
	
	public Country(String name) {
		this.setName(name);
	}
	public void setPopulation(int pop) {
	
		
	}
	public void setArea(double a) {
	
	}
	
	public void Addregion(State s){
		Regionarray[RegionCount] = s;
		RegionCount++;
		return;
	}
	
	public Region getRegion(int i){
		
		Region newRegion = Regionarray[i];
		return newRegion;
	}
	
	public void DisplayGovenor(){
		for (int i = 0; i <= this.RegionCount; i++){
			Region r = this.getRegion(i);
			r.toString();
		}
	}

	public String toString(){
		
		return "Name " + this.getName()
				+ " President " + this.getPresident()
				+ " Population " + this.getPopulation()
				+ " Area " + this.getArea();

	}

	public void setPopulation(int i, int pop) {
			Regionarray[i].setPopulation(pop);
			return;
		}

	public void setArea(int i, double a) {
			Regionarray[i].setArea(a);
			return;
		}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}


}
