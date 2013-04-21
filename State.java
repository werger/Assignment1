
public class State extends ContainerRegion{

	private String govenor = "";
	
	public State(String name) {
		
		this.setName(name);
	}

	public String getGovenor() {
		return govenor;
	}

	public void setGovenor(String govenor) {
		this.govenor = govenor;
	}
	
	public void Addregion(City c){
		Regionarray[RegionCount] = c;
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
				+ " Govenor " + this.getGovenor()
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

	void setPopulation(int pop) {
		return;
		
	}

	void setArea(double a) {
		return;
		
	}
	
}
