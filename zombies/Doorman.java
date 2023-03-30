/*
Burak Once   burakonce9@gmail.com
ZombieSlayer
Doorman class
*/

public class Doorman extends Thread {
    Zombiecounter zc;
  
    public Doorman(Zombiecounter zombieCounter) {
      this.zc = zombieCounter;
    }
  
    public void run() {
  
      while (!zc.tooManyZombiesInTheRoom() && !zc.killed100Zombies()) {
        double r = Math.random();
  
        if (r < 0.5) {
          zc.zombieEntered();
        }
        try {
          Thread.sleep(2);
  
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  
  }
  