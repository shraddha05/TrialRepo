public class Animal {
private int legs;

    public void setLegs(int legs) {
        this.legs = legs;
    }
    public Animal(int legs){
        this.legs=legs;
    }
    public void printlegs(){
        System.out.println("cat has "+legs+" legs");
    }
}
