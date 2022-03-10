/**
 *
 * @author JoãoGCF
 */
public class DecoratedSmallRoom extends MyBuildingDecorator{
    
    public DecoratedSmallRoom(MyBuilding myBuilding){
        this.myBuilding =  myBuilding;
        this.name = myBuilding.name + " (SmallRoom)";
    }
    
    public String getName(){
        return this.name;
    }
    
    public double cost(){
        return  myBuilding.cost() + 22000   ;
    }
    
    public double area(){
        return  myBuilding.area() + 600;
    }
}