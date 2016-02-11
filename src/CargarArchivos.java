import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aron on 11/02/16.
 */
public class CargarArchivos {


    static int filas;
    static int columnas;
    static int drones;
    static int cargaMaxima;
    static int deadLine;

    static int numeroTipos;

    static int pesos[];

    static int numeroAlmacenes;

    static ArrayList<Warehouse> listadoAlamacenes;


    public static void main(String[] args){
        Scanner sc = new Scanner("fichero.txt");

        //Primera Seccion: Datos Generales
        filas = sc.nextInt();
        columnas = sc.nextInt();
        drones = sc.nextInt();
        deadLine = sc.nextInt();
        cargaMaxima= sc.nextInt();

        //Segunda Seccion: Numero de objetos diferentes
        numeroTipos = sc.nextInt();

        //Tercera Seccion: CargarPesos
        for(int i=0; i< numeroTipos;i++){
            pesos[i]=sc.nextInt();
        }

        //Cuarta Seccion: Numero de almacenes
        numeroAlmacenes=sc.nextInt();

        //Quinta Seccion: Informacion almacenes
        for(int z =0; z < numeroAlmacenes; z++){
            int aFil = sc.nextInt();
            int aCol = sc.nextInt();
            int [] deposito = new int[numeroTipos];
            for(int i=0; i< numeroTipos;i++){
                deposito[i]=sc.nextInt();
            }
            Warehouse almacenAuxiliar = new Warehouse(deposito,aCol,aFil,z);
            listadoAlamacenes.add(almacenAuxiliar);
        }




    }


}
