public abstract class Vehiculo
{
 protected String marca;
 protected String color;
 public Vehiculo(String marca, String color){
    setMarca(marca);
    setColor(color);
    }
 public void setMarca(String marca){
    this.marca=marca;
    }   
 public String getMarca(){
    return marca;
    }
 public void setColor(String color){
    this.color=color;
    }   
 public String getcolor(){
    return color;
    }
 public abstract int CalcCobro(int hr);   
}
