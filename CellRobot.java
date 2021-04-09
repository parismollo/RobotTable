public class CellRobot{
  private Robot robot;
  private CellRobot next_robot_cell;
  private CellRobot previous_robot_cell;

  public CellRobot(Robot robot, CellRobot next, CellRobot previous){
    this.robot = robot;
    this.next_robot_cell = next;
    this.previous_robot_cell = previous;
  }
}
