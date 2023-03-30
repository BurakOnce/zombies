/*
Burak Once   burakonce9@gmail.com
ZombieSlayer
Slayer class
*/

public class Slayer extends Thread {
    Zombiecounter zc;
  
    public Slayer(Zombiecounter zc) {
      this.zc = zc;
    }
  
    public void run() {
  
      while (!zc.tooManyZombiesInTheRoom() && !zc.killed100Zombies()) {
  
        zc.zombieKilled();
  
        try {
          Thread.sleep(2);
  
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
  
    }
  }
  