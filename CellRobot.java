public class CellRobot{
  private Robot robot;
  private CellRobot next_robot_cell;
  private CellRobot previous_robot_cell;

  public CellRobot(Robot robot, CellRobot next, CellRobot previous){
    this.robot = robot;
    this.next_robot_cell = next;
    this.previous_robot_cell = previous;
  }

  public void setNextCellRobot(CellRobot c){
    this.next_robot_cell = c;
  }

  public void setPreviousCellRobot(CellRobot c){
    this.previous_robot_cell = c;
  }

  public Robot getRobot(){
    return this.robot;
  }
  public CellRobot getNextRobotCell(){
    return this.next_robot_cell;
  }
  public CellRobot getPreviousRobotCell(){
    return this.previous_robot_cell;
  }
  public void affiche(){
    CellRobot aux = this;
    do {
      aux.robot.description();
      System.out.print(" ");
      aux = aux.next_robot_cell;
    } while (aux!=this);
  }

  // public void ajoute(Robot r){
  //
  // }
}
