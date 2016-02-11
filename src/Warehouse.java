/**
 * Created by aron on 11/02/16.
 */
public class Warehouse {


    private int [] deposito;
    private int cola;
    private int fila;
    private int indentificador;

    public Warehouse(int[] udeposito, int ucola, int ufila,int uindentificador){
        this.deposito = udeposito;
        this.cola = ucola;
        this.fila = ufila;
        this.indentificador= uindentificador;
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
