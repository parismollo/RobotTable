public class Test {
  public static void main(String[] args){
    System.out.println("            TP8 by Paris Mollo       ");

    // tests #1
    System.out.println("--------------SET OF TESTS #1--------------");
    System.out.println();
    Robot r = new Robot('a', "hello world");
    System.out.println("Robot id: "+r.getId());
    System.out.println("Robot np: "+r.getNp());
    System.out.println("Robot nom: "+r.getNom());
    System.out.println("Robots created: "+Robot.nbRob);
    System.out.print("Robot says: ");
    System.out.println("Robot has "+r.parle(5)+" words left");
    System.out.print("Robot can no longer talk ?"); System.out.println(" "+r.finiDeParler());
    System.out.println();
    System.out.println("--------------END OF TESTS #1--------------");
    // end of tests #1

    // tests # 2
    System.out.println("--------------SET OF TESTS #2--------------");
    System.out.println();
    TableRonde tr = new TableRonde(r);
    CellRobot current_robot_cell = tr.getCurrentRobotCell();
    Robot current_robot = current_robot_cell.getRobot();
    System.out.println("Current robot name "+current_robot.getNom());
    System.out.println();
    System.out.println("--------------END OF TESTS #2--------------");
  }
}
