public class Pizza
{
 private int nureb;
 public Pizza(int nureb){
    setnureb(nureb);
    }
 public void setnureb(int nureb){
     if(nureb>0){
    this.nureb=nureb;
    }else{
    nureb=0;
    }
    }   
 public int getnureb(){
    return nureb;
    } 
}
