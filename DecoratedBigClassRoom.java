/**
 *
 * @author JoãoGCF
 */
public class DecoratedBigClassRoom extends MyBuildingDecorator{
    
    public DecoratedBigClassRoom(MyBuilding myBuilding){
        this.myBuilding =  myBuilding;
        this.name = myBuilding.name + " (BigClassRoom)";
    }
    
    public String getName(){
        return this.name;
    }
    
    public double cost(){
        return  myBuilding.cost() + 25550;
    }
    
    public double area(){
        return  myBuilding.area() + 1000;
    }
}
