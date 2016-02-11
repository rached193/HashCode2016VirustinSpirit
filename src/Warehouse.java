/**
 * Created by aron on 11/02/16.
 */
public class Warehouse {


    private int [] deposito;
    private Position position;

    public Warehouse(int[] udeposito, Position position){
        this.deposito = udeposito;
        this.position = position;
    }

    public void load(int identificador, int cantidad){
        if(deposito[identificador]>=cantidad){
            deposito[identificador]-=cantidad;
        }else{
            //Trow Exception
        }
    }

    public void unload(int identificador, int cantidad){
        deposito[identificador]+=cantidad;
    }

    public boolean check(int identificador, int cantidad){
        if(deposito[identificador]>=cantidad){
            return true;
        }else{
            return false;
        }
    }
}
