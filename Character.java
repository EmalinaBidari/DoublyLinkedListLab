public abstract class Character{
  protected int hp;
  /**
  Creates a character object without any hp value
  hp initialized to -10 (means it's not dead but hp was never set)
  */
  public Character(){
    hp = -10;
  }
  /**
  Creates a character object
  @param hp Health Points for the character
  */
  public Character(int hp){
    this.hp = hp;
  }

  /**
  Sets the hp of a character.
  @param hp some integer value
  */
  public void setHP(int hp){
    this.hp = hp;
  }

  /**
  Gets the characters hp
  @return hp value of the character, an integer
  */
  public int getHP(){
    return hp;
  }

  /**
  Checks how much hp a character has. If it is 0, the character is dead
  @return true if character is dead, false if hp>0.
  */
  public boolean isDead(){
    if(hp == 0)
    {
      return true;
    }
    return false;
  }


    public abstract Attack attack();
    public abstract void takeDamage(SmashAttack a);
    public abstract void takeDamage(FireAttack a);
    public abstract void takeDamage(SlashAttack a);

}
