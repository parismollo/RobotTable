public class Robot{
  static int nbRob = 0;
  private int id=0;
  private int np;
  private char nom;

  public Robot(char nom, String text) {
    this.id = nbRob;
    this.np = text.length();
    this.nom = nom;
    nbRob++;

  }

  public boolean finiDeParler(int np){
    if (np==0){return true;}
    else return false;
  }

  public int parle(int n){
    System.out.println("J'ai prononcé "+n+" lettres")
    return this.np - n;
  }
}
