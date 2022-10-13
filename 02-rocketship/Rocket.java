
/**
 * Write a description of class Rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rocket
{
    public static void main(String[] args) {
        triangle();
        square();
        unitedStates();
        square();
        triangle();

    }
    
    public static void triangle(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    
    public static void square(){
        System.out.println("+______+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+______+");
    }
    
    public static void unitedStates(){
        System.out.println("|United|");
        System.out.println("|States|");
    }
}
