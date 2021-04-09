public class Test {
  public static void main(String[] args){
    System.out.println("      TP8 by Paris Mollo       ");
    Robot r = new Robot('a', "hello world");

    // tests
    System.out.println("Robot id: "+r.getId());
    System.out.println("Robot np: "+r.getNp());
    System.out.println("Robot nom: "+r.getNom());
    System.out.println("Robots created: "+Robot.nbRob);
    System.out.print("Robot says: ");
    System.out.println("Robot has "+r.parle(5)+" words left");
    System.out.print("Robot can no longer talk ?"); System.out.print(" "+r.finiDeParler());
    // end of tests
  }
}
