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
    public void abrirpuertasal(Salon s){
    if(s.getpuerta().getestado()==false){
      s.getpuerta().setestado(true);
    }
    }
    public void abrirpuerta(Puerta p){
    p.setestado(true);
    }   
     public void abirirpuertasal2(Salon s){
    abrirpuerta(s.getpuerta());
    }   
    }
    

