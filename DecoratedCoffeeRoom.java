/**
 *
 * @author JoãoGCF
 */
public class DecoratedCoffeeRoom extends MyBuildingDecorator{
    
    public DecoratedCoffeeRoom(MyBuilding myBuilding){
        this.myBuilding =  myBuilding;
        this.name = myBuilding.name + " (Coffee Room)";
    }
    
    public String getName(){
        return this.name;
    }
    
    public double cost(){
        return  myBuilding.cost() + 20000;
    }
    
    public double area(){
        return  myBuilding.area() + 600;
    }
}