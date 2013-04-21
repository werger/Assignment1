
public abstract class AtomicRegion extends Region {
	
	private int population;
	private double area;
	
	public int getPopulation(){
	
		return population; 
	
	}
	
	public double getArea(){
		
		return area;
		
	}
	
	public void setPopulation(int pop){
		
		population = pop;
		return;
	}
	
	public void setArea(double a){
		area = a;
		return;
	}
		
	public String toString(){
		return "Name " + this.getName() + " Population " + this.getPopulation() + " Area " + this.getArea();
	}
}
