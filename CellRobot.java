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
      System.out.print("; ");
      aux = aux.next_robot_cell;
    } while (aux!=this);
  }

  public void supprimer(int id){
    CellRobot cb = this.next_robot_cell;
    while (cb!=this){
      if (cb.getRobot().getId() == id){
        cb.getPreviousRobotCell().setNextCellRobot(cb.getNextRobotCell());
        cb.getNextRobotCell().setPreviousCellRobot(cb.getPreviousRobotCell());
        break;
      }else {cb=next_robot_cell;}
    }
  }

  public void supprimer(char nom){
    CellRobot cb = this.next_robot_cell;
    while (cb!=this){
      if (cb.getRobot().getNom() == nom){
        cb.getPreviousRobotCell().setNextCellRobot(cb.getNextRobotCell());
        cb.getNextRobotCell().setPreviousCellRobot(cb.getPreviousRobotCell());
        break;
      }else {cb=next_robot_cell;}
    }
  }
}
