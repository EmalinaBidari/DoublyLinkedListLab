/**
A subclass of the character class. Berserker is a character in the RPG
that takes damage and attacks according to the specification in the lab report:
Berserker contestants attack a random contestant in the arena and deal 20
smashing damage. They may hit themselves. They can take 35 points of
damage before dying. They take half damage from fire, and double from
slashing damage
*/
public class Berserker extends Character{
  /**
  Constructor creates a Berserker object. Calls upon the Character constructor
  with initial hp of 35.
  */
  public Berserker(){
    super(35);
  }

  /**
  Decreases hp of a berserker object by half of the damage if attacked
  by fire.
  @param a A FireAttack
  */
  public void takeDamage(FireAttack a){
    this.setHP(hp - a.getDamage()/2);
  }

  /**
  Decreases hp of a berserker object by double of the damage if attacked
  by slash.
  @param a A SlashAttack
  */
  public void takeDamage(SlashAttack a){
    this.setHP(hp - a.getDamage()*2);
  }

  /**
  Decreases hp of a berserker object by the damage dealt if attacked
  by smash
  @param a A SmashAttack
  */
  public void takeDamage(SmashAttack a){
    this.setHP(hp - a.getDamage());
  }

  /**
  Berserker's mode of attack is Smash
  @return SmashAttack of damage 20
  */
  public Attack attack(){
    SmashAttack smash = new SmashAttack(20);
    return smash;
  }

  /**
  Returns a String representation of the Berserker object
  @return String : "Berserker with HP <hpValue>"
  */
  public String toString(){
    return "Berserker with HP " + this.getHP();
  }

}
