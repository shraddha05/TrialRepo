public class Bike {

    int cc ;
    String name ;
    String brand ;

    Bike(int tcc,String tname,String tbrand){
        cc = tcc ;
        name = tname ;
        brand = tbrand ;
    }

    @Override
    public String toString(){
        return "Bike name is : "+name+"\nBrand is "+brand+" \nCC is "+cc;
    }

}
