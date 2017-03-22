import java.util.Random;
/*
Code is not very reuseable
*/

public class Arena{

  public static void main(String[] args){
    Random rand = new Random();
    Character[] game  = createGame();
    System.out.println("Starting a game...");
    gameState(game);
    //Starting a game
    for (int i = 0; i < game.length; i++)
    {
      //we know the first two are berserkers
      if (i < 2)
      {
        //attack an unlucky opponent in the arena, themselves included.
        int unlucky = rand.nextInt(6);
        game[unlucky].takeDamage(game[i].attack());
        //announce who took how much,what kind, and from who
        System.out.println(game[unlucky] + " took damage of " + game[i].attack().getDamage()
        + " from " + game[i]);
        //if character is dead, announce it
        if (game[unlucky].isDead()) {System.out.println(game[unlucky] + " is dead.");}
      }
      //we know the next two are Warriors
      else if (i >= 2 && i < 4)
      {
        //look at all potential targets and attack the one with the most hp.
        //cannot attack itself
        //comparison to find character with max hp
        Character maxHP = game[0];
        for (int j = 0; j < game.length; j++)
        {
          if (j == i) {continue;} //skips itself
          if (game[j].getHP() > maxHP.getHP())
          {
            maxHP = game[j];
          }
        }

        maxHP.takeDamage(game[i].attack());
        //announce who took how much,what kind, and from who
        System.out.println(maxHP + " took damage of " + game[i].attack().getDamage()
        + " from " + game[i]);
        //if character is dead, announce it
        if (maxHP.isDead()) {System.out.println(maxHP + " is dead.");}
      }
      //last two are Mages
      else
      {

        for (Character c: game)
        {

          c.takeDamage(game[i].attack());
          //announce who took how much,what kind, and from who
          System.out.println(c + " took damage of " + game[i].attack().getDamage()
          + " from " + game[i]);
          //if character is dead, announce it
          if (c.isDead()) {System.out.println(c + " is dead.");}
        }
      }
    }
    gameState(game);

  }

  /**
  Creates a game with 2 of each character types.
  Not reuseable. Method to satisfy lab specs.
  @return character array
  */
  public static Character[] createGame(){
    Character[] arena  = new Character[6];
    Berserker b1 = new Berserker();
    Berserker b2 = new Berserker();
    arena[0] = b1;
    arena[1] = b2;
    System.out.println(b2);
    Warrior w1 = new Warrior();
    Warrior w2 = new Warrior();
    arena[2] = w1;
    arena[3] = w2;
    Mage m1 = new Mage();
    Mage m2 = new Mage();
    arena[4] = m1;
    arena[5] = m2;
    return arena;
  }

  /**
  Game state prints out a description of the Arena.
  @param Character[] array
  */
  public static void gameState(Character[] charr){
    for (int i = 0; i < charr.length; i++)
    {
      System.out.println((i+1) + ". " + charr[i]);
    }
  }
}
