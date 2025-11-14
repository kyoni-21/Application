public class Soda implements Sellable {
public int getNumGlasses () {
    return 3; 
}
public String getContent () {
    return "Carbonated drinks"; 
}
     public static void main (String[] args) {
        Soda s = new Soda();
        System.out.print(s.getContent() + ": " + s.getNumGlasses() + " glasses")
     }
}