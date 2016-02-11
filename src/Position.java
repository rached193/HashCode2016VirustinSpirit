public class Position {
	private final int x,y;
	public Position(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public double getDistance(Position p){
		return Math.sqrt(Math.pow(p.getX()+getX(),2)+Math.pow(p.getY()+getY(),2));
	}
}
