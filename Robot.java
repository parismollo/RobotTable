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

  public boolean finiDeParler(){
    if (this.np==0){return true;}
    else return false;
  }

  public int parle(int n){
    System.out.println("J'ai prononce "+n+" lettres");
    int previous_np = this.np;
    this.np -= n;
    return previous_np - n;
  }

  public int getId(){
    return this.id;
  }
  public int getNp(){
    return this.np;
  }
  public char getNom(){
    return this.nom;
  }
}
