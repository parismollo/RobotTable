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
    System.out.println();
    // tests # 2
    System.out.println("--------------SET OF TESTS #2--------------");
    System.out.println();
    TableRonde tr = new TableRonde(r);
    CellRobot current_robot_cell = tr.getCurrentRobotCell();
    Robot current_robot = current_robot_cell.getRobot();
    System.out.println("Current robot name "+current_robot.getNom());
    System.out.println();
    System.out.println("--------------END OF TESTS #2--------------");

    System.out.println();

    System.out.println("--------------SET OF TESTS #3--------------");
    tr.affiche();
    System.out.println("--------------END OF TESTS #3--------------");

    System.out.println();

    System.out.println("--------------SET OF TESTS #4--------------");
    Robot r2 = new Robot('b', "super");
    Robot r3 = new Robot('c', "cool");
    tr.ajouteRobot(r2);
    tr.ajouteRobot(r3);
    tr.affiche();

    System.out.print("Current Robot: ");
    tr.getCurrentRobotCell().getRobot().description();
    System.out.println();

    System.out.print("Next Robot: ");
    tr.getCurrentRobotCell().getNextRobotCell().getRobot().description();
    System.out.println();

    System.out.print("Last Robot: ");
    tr.getCurrentRobotCell().getPreviousRobotCell().getRobot().description();
    System.out.println();
    System.out.println("--------------END OF TESTS #4--------------");

    System.out.println();

    System.out.println("--------------SET OF TESTS #5--------------");
    tr.affiche();
    tr.supprimer(1);
    tr.getCurrentRobotCell().getRobot().description();
    System.out.println();
    // tr.supprimer(2);
    tr.affiche();
    System.out.println("--------------END OF TESTS #5--------------");

    System.out.println();

    System.out.println("--------------SET OF TESTS #6--------------");
    tr.affiche();
    tr.supprimer('a');
    tr.getCurrentRobotCell().getRobot().description();
    System.out.println();
    tr.supprimer(2);
    tr.affiche();
    System.out.println("--------------END OF TESTS #6--------------");

    System.out.println();

    System.out.println("--------------SET OF TESTS #7--------------");
    System.out.println(tr.getSize());
    System.out.println("--------------END OF TESTS #7--------------");

    System.out.println();

    System.out.println("--------------SET OF TESTS #8--------------");
    Robot x = new Robot('d', "nice super cool");
    Robot y = new Robot('e', "i like to talk!");
    Robot z = new Robot('f', "im shy...");
    tr.ajouteRobot(x); tr.ajouteRobot(y); tr.ajouteRobot(z);
    tr.startDiscussion();
    System.out.println("--------------END OF TESTS #8--------------");
  }
}
