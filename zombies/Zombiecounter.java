/*
Burak Once   burakonce9@gmail.com
ZombieSlayer
Zombiecounter class
*/

public class Zombiecounter {

    private int count = 0;
    private int killed = 0;
  
    synchronized void zombieEntered() {
      count++;
    }
  
    synchronized void zombieKilled() {
      count--;
      killed++;
    }
  
    synchronized boolean tooManyZombiesInTheRoom() {
      if (count > 100)
        return true;
  
      return false;
    }
  
    synchronized boolean killed100Zombies() {
      if (killed > 100)
        return true;
  
      return false;
    }
  
    synchronized boolean zombiesExist() {
      return count > 0;
    }
  
    synchronized int getKilledCount() {
      return killed;
    }
  
    synchronized int getInTheRoomCount() {
      return count;
    }
  }
  