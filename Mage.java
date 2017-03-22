import java.util.Random;
/**
A subclass of the character class. Mage is a character in the RPG
that takes damage and attacks according to the specification in the lab report:
Wild mages deal fire damage to everyone in the arena, themselves included.
Each target takes a random amount of damage between 0 and
6 fire damage (calculated per target.) A mage takes between 10 and 60
points of damage to kill a mage. When they are killed they deal 5 fire
damage back to whoever killed them.

*/

public class Mage extends Character{
  private static Random rand = new Random();
  private static int inithp = rand.nextInt(51) + 10;
  /**
  Constructor for a Mage object calls upon super class contructor with random
  value between 10 and 60, inclusive.
  */
  public Mage(){
    super();
    Random rand = new Random();
    int hp = rand.nextInt(51) + 10;
    this.setHP(hp);
  }

  /**
  Decreases hp of a mage object by the damage if attacked
  by fire.
  @param a A FireAttack
  */
  public void takeDamage(FireAttack a){
    this.setHP(hp - a.getDamage());
  }

  /**
  Decreases hp of a mage object by the damage if attacked
  by fire.
  @param a A FireAttack
  */
  public void takeDamage(SlashAttack a){
    this.setHP(hp - a.getDamage());
  }

  /**
  Decreases hp of a mage object by the damage if attacked
  by fire.
  @param a A FireAttack
  */
  public void takeDamage(SmashAttack a){
    this.setHP(hp - a.getDamage());
  }
  /**
  Wild mages deal fire damage to everyone in the arena, themselves included.
  @return FireAttack of random value between 0 and 6
  */
  public Attack attack(){
    int val = rand.nextInt(7);
    FireAttack fire = new FireAttack(val);
    return fire;
  }
  /**
  Returns a String representation of the Mage object
  @return String : "Mage with HP <hpValue>"
  */
  public String toString(){
    return "Mage with HP " + this.getHP();
  }

}
