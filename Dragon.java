
/**
@description Base class for Dragon 
*/
public class Dragon
{
  //fields
  String name;
  int hp;
  int mHp;

  /**
  @description Base class Dragon constructor
  @param string dragon name, int maxhp for current dragon
  @return none
  */
  Dragon( String name, int mHp )
  {
    this.name = name;
    this.hp = mHp;
    this.mHp = mHp;
  }

  /**
  @description attack function for dragons
  @param none
  @return the amount of damage to subtract
  */
  int attack()
  {
    return (int)(Math.random() * 7) + 3 ;
  }

  /**
  @description subtracts from the dragon's hp
  @param the amount to subtract
  @return none
  */
  void takeDamage( int damage )
  {
    hp = hp - damage;
    if ( hp < 0 )
    {
      hp = 0;
    }
  }

  /**
  @description prints the dragon's name and hp/mhp
  @param none
  @return none
  */
  public String toString()
  {
    return "Name: " + name + " hp: " + hp + "/" + mHp;
  }
}
