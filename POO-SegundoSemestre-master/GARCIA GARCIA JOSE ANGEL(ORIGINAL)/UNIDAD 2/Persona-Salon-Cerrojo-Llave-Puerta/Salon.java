public class Salon
{
  private String nombre;
  private Puerta puert;
  public Salon(String nombre, Puerta puert){
    setnombre(nombre);
    setpuerta(puert);
    }
  public void setnombre(String nombre){
    this.nombre=nombre;
    }  
  public String getnombre(){
    return nombre;
    }
  public void setpuerta(Puerta puert){
    this.puert=puert;
    }  
  public Puerta getpuerta(){
    return puert;
    }  
}
