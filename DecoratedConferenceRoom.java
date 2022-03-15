/**
 *
 * @author JoãoGCF
 */
public class DecoratedConferenceRoom extends MyBuildingDecorator{
    
    public DecoratedConferenceRoom(MyBuilding myBuilding){
        this.myBuilding =  myBuilding;
        this.name = myBuilding.name + " (Conference Room)";
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