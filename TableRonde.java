public class TableRonde{
  private CellRobot current_robot_cell;

  public TableRonde(Robot robot){
    CellRobot cr = new CellRobot(robot, null, null);
    this.current_robot_cell = cr;
  }

  public CellRobot getCurrentRobotCell(){
    return this.current_robot_cell;
  }

  public void affiche(){
    // affiche liste de Robots
    
  }
}
