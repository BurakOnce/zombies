/*
Burak Once   burakonce9@gmail.com
ZombieSlayer
Simulator class
*/
/*
Bu bir hayatta kalma oyunudur
Arkadaslarınızla birlike bir binada mahsur kalmıssınız
Her kapıda bir arkadasınız var
Kapılar sırayla acılır ve siz zombileri öldürürsünüz
zombi sayısı 100ü gecerse kaybedersiniz
100 zombi öldürürseniz kazanırsınız
*/
public class Simulator {
    public static void main(String[] args) {
  
      Doorman[] doormen; // kapıdaki arkadaslar
      Slayer slayer; // siz
  
      Zombiecounter zc = new Zombiecounter();
  
      slayer = new Slayer(zc);
  
      int n = Integer.parseInt(args[0]);
      doormen = new Doorman[n];
  
      for (int i = 0; i < n; i++) {
        doormen[i] = new Doorman(zc); // kapıdaki kisilerin baslatılması
      }
  
      for (int i = 0; i < n; i++) {
        doormen[i].start();
      }
      slayer.start();
  
      try {
        slayer.join();
        for (int i = 0; i < n; i++) {
          doormen[i].join();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
  
      }
  
      System.out.println("Game Over!\n" + "you" + (zc.getKilledCount() >= 100 ? " won!" : " lost!"));
      System.out.println(" Count Zombies: " + zc.getInTheRoomCount());
      System.out.println("Killed Zombies: " + zc.getKilledCount());
  
    }
  }
  