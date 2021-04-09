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

  public void supprimer(int id){
    // if empty
    if (isEmpty()){
      return;
    }
    if (this.current_robot_cell.getRobot().getId() == id){
      this.current_robot_cell.getPreviousRobotCell().setNextCellRobot(this.current_robot_cell.getNextRobotCell());
      this.current_robot_cell.getNextRobotCell().setPreviousCellRobot(this.current_robot_cell.getPreviousRobotCell());
      this.current_robot_cell = this.current_robot_cell.getNextRobotCell();
    }else{
      this.current_robot_cell.supprimer(id);
    }
  }

  public void supprimer(char nom){
    // if empty
    if (isEmpty()){
      return;
    }
    if (this.current_robot_cell.getRobot().getNom() == nom){
      this.current_robot_cell.getPreviousRobotCell().setNextCellRobot(this.current_robot_cell.getNextRobotCell());
      this.current_robot_cell.getNextRobotCell().setPreviousCellRobot(this.current_robot_cell.getPreviousRobotCell());
      this.current_robot_cell = this.current_robot_cell.getNextRobotCell();
    }else{
      this.current_robot_cell.supprimer(nom);
    }
    // if not empty
  }
}
