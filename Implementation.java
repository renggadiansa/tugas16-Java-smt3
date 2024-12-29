interface Berkendara {
  void mulaiPerjalanan();
}

class Mobil implements Berkendara {
  @Override
  public void mulaiPerjalanan() {
    System.out.println("Mobil mulai perjalanan");
  }
}

class Motor implements Berkendara {
  @Override
  public void mulaiPerjalanan() {
    System.out.println("Motor mulai perjalanan");
  }
}

public class Implementation {
  public static void main(String[] args) {
    Berkendara mobil = new Mobil();
    mobil.mulaiPerjalanan();

    Berkendara motor = new Motor();
    motor.mulaiPerjalanan();
  }
}
