public class Persona
{
 private String nombre;
 public Persona(String nombre){
    setnombre(nombre);
    } 
 public void setnombre(String nombre){
    this.nombre=nombre;
    }   
 public String getnombre(){
    return nombre;
    }  
 public void abirirpuertasal(Salon s, Llave ll){
     if(s.getpuerta().getestado()==false && ll.getcodigo().equals(s.getpuerta().getcerrojo().getcodigo())){
        s.getpuerta().setestado(true);
        }
    }
 public void abrirpuerta(Puerta p, Llave ll){
    if(p.getestado()==false && p.getcerrojo().getcodigo().equals(ll.getcodigo()))
    {p.setestado(true);}
    }   
 public void abirirpuertasal2(Salon s, Llave ll){
    abrirpuerta(s.getpuerta(),ll);
    }      
}
