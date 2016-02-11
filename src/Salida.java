import java.io.FileWriter;
import java.io.IOException;


public class Salida {
	private FileWriter fw;
	
	public Salida(String ruta){
		try {
			fw=new FileWriter(ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Load(int dronid, int warehouseid, int productid,int cantidad){
		try {
			fw.write(dronid+" L "+warehouseid+" "+productid+" "+cantidad);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Unload(int dronid, int warehouseid, int productid,int cantidad){
		try {
			fw.write(dronid+" U "+warehouseid+" "+productid+" "+cantidad);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Deliver(int dronid, int costumerid, int productid,int cantidad){
		try {
			fw.write(dronid+" D "+costumerid+" "+productid+" "+cantidad);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Wait(int dronid, int turnos){
		try {
			fw.write(dronid+" D "+turnos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
