import java.util.*;
public class Estacionamiento2
{
   private Vector <Vehiculo> a;
   public Estacionamiento2(int tam){
    a=new Vector <Vehiculo> (tam);
    }
   public void agregar(Vehiculo v){
    a.add(v);
    } 
   public void remover(int pos){
    a.remove(pos);
    } 
}
