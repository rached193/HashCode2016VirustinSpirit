public class Drone {
	int positionR, positionC, maximumLoad, currentWeight;
	Element elements;
	
	public Drone(int initialPositionR, int initialPositionC, int maxLoad,
				 int numTypeElements) {
		positionR = initialPositionR;
		positionC = initialPositionC;
		maximumLoad = maxLoad;
		currentWeight = 0;
		elements = new Element[numTypeElements];
	}
	
	public boolean canLoad(Element e) {
		if (e.weight() + currentWeight > maximumLoad) {
			return false;
		} else {
			return true;
		}
	}
	
	public void load(Element e) {
		elements[e.type()] += 1;
		currentWeight += e.weight; 
	}
	
	public void unload(int type) {
		elements[type] = -1; 
	}
	
	public int currentPositionR() {
		return positionR;
	}
	
	public int currentPositionC() {
		return positionC;
	}
	
	// Returns the number of turns that take to get to the position
	// Note: updates the position to the final position
	public int moveTo(int finalPositionR, int finalPositionC) {
		int initialPositionR, initialPositionC;
		initialPositionR = positionR;
		initialPositionC = positionC;
		positionR = finalPositionR;
		positionC = finalPositionC;
		return (int)Math.ceil(Math.sqrt((finalPositionR - initialPositionR )^2 + (finalPositionC - initialPositionC)^2));
	}
}