
public abstract class Region {

	private String name;
	public abstract int getPopulation();
	public abstract double getArea();
	abstract void setPopulation(int pop);
	abstract void setArea(double a);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}
