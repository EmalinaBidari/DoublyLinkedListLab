import java.util.Random;
/**
A subclass of the character class. Warrior is a character in the RPG
that takes damage and attacks according to the specification in the lab report:
The warrior looks at all of his potential targets and attacks the one he
finds most threatening, which is determined by how much damage it would
take to kill a target. Warriors never attack themselves Their attacks deal
between 10 and 16 slashing damage, and they take between 20 and 40
points of damage before dying. A warrior has a 25% chance to dodge
smashing or slashing damage.

*/
public class Warrior extends Character{
   Random rand = new Random();
   int inithp = rand.nextInt(21) + 10;

  /**
  Constructor for a Mage object calls upon super class contructor with random
  value between 20 & 40, inclusive.
  */
  public Warrior(){
    super();
    Random rand = new Random();
    int hp = rand.nextInt(21) + 10;
    this.setHP(hp);
  }

  /**
  Decreases hp of a warrior object by the damage if attacked
  by fire.
  @param a A FireAttack
  */
  public void takeDamage(FireAttack a){
    this.setHP(hp - a.getDamage());
  }

  /**
  Decreases hp of a warrior object by the damage if attacked
  by Slash and the attack is not dodged. Warrior has a 1 in 4 chance to dodge.
  @param a A SlashAttack
  */
  public void takeDamage(SlashAttack a){
    Random rand = new Random();
    int dodge = rand.nextInt(3)+1;
    if (dodge == 1) {return;}
    else
    {
      this.setHP(hp - a.getDamage());
    }
  }

  /**
  Decreases hp of a warrior object by the damage if attacked
  by Smash and the attack is not dodged. Warrior has a 1 in 4 chance to dodge.
  @param a A SmashAttack
  */
  public void takeDamage(SmashAttack a){
    Random rand = new Random();
    int dodge = rand.nextInt(3) + 1;
    if (dodge == 1) {return;}
    else
    {
      this.setHP(hp - a.getDamage());
    }
  }

  /**
  Warrior attacks the most threatening target, based on their hp.
  Will never attack itself.
  @return Slash of random value between 10 and 16
  */
  public Attack attack(){
    Random rand = new Random();
    int val = rand.nextInt(6) + 10;
    SlashAttack slash = new SlashAttack(val);
    return slash;
  }

  /**
  Returns a String representation of the Warrior object
  @return String : "Warrior with HP <hpValue>"
  */
  public String toString(){
    return "Warrior with HP " + this.getHP();
  }

}
