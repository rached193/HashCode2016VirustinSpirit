import java.util.HashMap;


public class Drone {
	Position pos; 
	int maximumLoad, currentWeight;
	HashMap<Integer, Integer> elements;

	public Drone(Position position, int maxLoad) {
		pos=position;
		maximumLoad = maxLoad;
		currentWeight = 0;
		elements = new HashMap<Integer, Integer>();
	}

	public boolean canLoad(Element e) {
		if (e.getWeith() + currentWeight > maximumLoad) {
			return false;
		} else {
			return true;
		}
	}

	public void load(Element e) {
		if (!elements.containsKey(e.getId())) {
			elements.put(e.getId(), 0);
		}
		elements.put(e.getId(), elements.get(e)+1);
	}

	public void unload(int type) {
		if (!elements.containsKey(type)
				|| elements.get(type)==0) {
			//throw exception
		}
		elements.put(type, elements.get(type)-1);
	}

	public Position currentPosition() {
		return pos;
	}

	// Returns the number of turns that take to get to the position
	// Note: updates the position to the final position
	public double moveTo(Position p) {
		double dist=pos.getDistance(p);
		pos=p;
		return dist;
	}
}
