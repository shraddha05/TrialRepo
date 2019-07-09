public class Cars {

    int id ;
    String name ;

    Cars(int tid , String tname){
        id = tid ;
        name = tname ;
    }

    @Override
    public String toString(){
        return "Car id is "+id+" Car name is "+name;
    }
}
