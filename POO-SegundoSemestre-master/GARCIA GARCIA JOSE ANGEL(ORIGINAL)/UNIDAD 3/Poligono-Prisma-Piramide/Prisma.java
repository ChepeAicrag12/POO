public class Prisma
{
 private Poligono base;
 private double altura;
 public Prisma(Poligono base,double altura){
  setBase(base);
  setAltura(altura);
 }
 public void setBase(Poligono base){
 this.base=base;
    }   
 public Poligono getBase(){
  return base;
 }
 public void setAltura(double altura){
 this.altura=altura;   
 }   
 public double getAltura(){
 return altura;   
 }
 public double calcVolumen(){
 return base.calcArea()*altura;   
 }
}
