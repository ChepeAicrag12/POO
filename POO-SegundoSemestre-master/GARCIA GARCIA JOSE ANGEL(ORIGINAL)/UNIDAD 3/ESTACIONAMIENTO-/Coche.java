public class Coche extends Vehiculo
{
 private int np;
 public Coche(String marca, String color, int np){
    super(marca,color);
    setnp(np);
    }
 public void setnp(int np){ 
    if(np>0)
     this.np=np;
    }   
 public int getnp(){
    return np;
    }
 public int CalcCobro(int hr){
    if(np<=5){
    return 15*hr;
    }
    return (15*hr)+(hr*(np-5));
    }   
}
