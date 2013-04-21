
public abstract class ContainerRegion extends Region{

	private int population;
	private double area;
	protected Region[] Regionarray;
	protected int RegionCount = 0;
	
	public int getPopulation(){
		for (int i = 0; i < RegionCount; i++){
			population += Regionarray[i].getPopulation();
		}
		return population;
	}
	
	public double getArea(){
		for (int i = 0; i < RegionCount; i++){
			area += Regionarray[i].getArea();
		}
		return area;
	}
	
	public ContainerRegion(){
		Regionarray = new Region[10];
	}
}
