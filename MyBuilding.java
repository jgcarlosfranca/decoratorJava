/**
 *
 * @author JoãoGCF
 * Classe geral para criação do MyBuilding
 */
public abstract class MyBuilding {
    String name = "My Building";
//    int restRoom = 0;;
//    int bigClassroom = 0;
//    int mediumClassRoom = 0;
//    int smallClassRoom = 0;
//    int facultyOffice = 0;
//    int conferenceRoom = 0;
//    int coffeeRoom = 0;
    
  
    

    public String getName(){
        return name;
    }

    public abstract double cost();

    public abstract double area();
    
    
    /* a implementação desses caras fere o conceito de Decorator pattern*/
    
//    public abstract int hasRestRoom();
//    
//    public abstract int hasBigClassRoom();
//    
//    public abstract int hasMediumClassRoom();
//    
//    public abstract int hasSmallClassRoom();
//
//    public abstract int hasFacultyOffice();
//    
//    public abstract int hasConferenceRoom(); 
//    
//    public abstract int hasCoffeeRoom(); 
}