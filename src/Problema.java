import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aron on 11/02/16.
 */
public class Problema {


    static int filas;
    static int columnas;
    static int drones;
    static int cargaMaxima;
    static int deadLine;

    static int numeroTipos;

    static int pesos[];

    static int numeroAlmacenes;

    static int numeroPedidos;

    static ArrayList<Warehouse> listadoAlamacenes;

    static ArrayList<Order> listadoPedidos;
    public int scoreAcumulado;

    public Problema(String file) {
    	cargarArchivo(file);
    	scoreAcumulado = 0;
    }


    public static void cargarArchivo(String file){
        Scanner sc = new Scanner("fichero.txt");

        //Primera Seccion: Datos Generales
        filas = sc.nextInt();
        columnas = sc.nextInt();
        drones = sc.nextInt();
        deadLine = sc.nextInt();
        cargaMaxima= sc.nextInt();

        //Segunda Seccion: Informacion Objetos
        numeroTipos = sc.nextInt();
        for(int i=0; i< numeroTipos;i++){
            pesos[i]=sc.nextInt();
        }

        //Tercera Seccion: Informacion Almacenes
        numeroAlmacenes=sc.nextInt();
        for(int z =0; z < numeroAlmacenes; z++){
            int aFil = sc.nextInt();
            int aCol = sc.nextInt();
            int [] deposito = new int[numeroTipos];
            for(int i=0; i< numeroTipos;i++){
                deposito[i]=sc.nextInt();
            }
            Warehouse almacenAuxiliar = new Warehouse(deposito,new Position(aFil,aCol),z);
            listadoAlamacenes.add(almacenAuxiliar);
        }

        //Cuarta Seccion: Informacion Pedidos
        numeroPedidos=sc.nextInt();
        for(int y =0; y < numeroPedidos; y++){
            int pFil = sc.nextInt();
            int pCol = sc.nextInt();
            int objetosEntregar = sc.nextInt();

            HashMap<Integer, Integer> store= new  HashMap<Integer, Integer>();
            for(int o = 0; o<objetosEntregar;o++){
                int code = sc.nextInt();
                if (!store.containsKey(code)) {
                    store.put(code, 0);
                }
                store.put(code, store.get(code)+1);
            }

            Order pedidoAuxiliar = new Order(new Position(pFil,pCol),store);
            listadoPedidos.add(pedidoAuxiliar);


        }



    }


}
