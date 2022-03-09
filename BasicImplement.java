/**
 * basic building tem um faculty office e um small room
 * @author JoãoGCF
 */
public class BasicBuilding extends MyBuilding{
    
    public BasicBuilding(){
        name = "Basic Building";
    }
    
    public double cost(){
        /* custo do faculty + small room*/
        return 22000 + 11000;
    }
    
    public double area(){
        /* area do faculty + small room*/
        return 300 + 600; 
    }
}
