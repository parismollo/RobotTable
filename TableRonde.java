public class TableRonde{
  private CellRobot current_robot_cell;

  public TableRonde(Robot robot){
    this.current_robot_cell = new CellRobot(robot, null, null);
    this.current_robot_cell.setNextCellRobot(this.current_robot_cell);
    this.current_robot_cell.setPreviousCellRobot(this.current_robot_cell);
  }

  public TableRonde(){
    this(null);
  }

  public CellRobot getCurrentRobotCell(){
    return this.current_robot_cell;
  }

  public boolean isEmpty(){
    return (this.current_robot_cell==null);
  }

  public void affiche(){
    if (!isEmpty()) {
      System.out.print("[ ");
      this.current_robot_cell.affiche();
      System.out.println(" ]");
    }else{
      System.out.println("Empty TableRonde");
    }
  }

  public void ajouteRobot(Robot r){
    if (isEmpty()){
      this.current_robot_cell=new CellRobot(r, null, null);
      this.current_robot_cell.setNextCellRobot(this.current_robot_cell);
      this.current_robot_cell.setPreviousCellRobot(this.current_robot_cell);
    }else{
      CellRobot new_robot_cell = new CellRobot(r, this.current_robot_cell, this.current_robot_cell.getPreviousRobotCell());
      this.current_robot_cell.getPreviousRobotCell().setNextCellRobot(new_robot_cell);
      this.current_robot_cell.setPreviousCellRobot(new_robot_cell);
    }
  }
}
