    import java.util.Scanner;

    public class Thief {
    
    public static void main(String [] args) {
    
    Scanner inputCollector = new Scanner(System.in);
    
    String name = "name";
    
    while(!name.replace(" ","").equalsIgnoreCase ("thief")) {
    System.out.print("Mention a name: ");
    String input = inputCollector.nextLine ();
    
    name = input;
    }   
    
    System.out.println(name + " has been caught");
    }
    
    } 
