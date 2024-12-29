class Hewan {
  public void makan() {
    System.out.println("Hewan makan");
  }
}

class Kucing extends Hewan {
  @Override
  public void makan() {
    System.out.println("Kucing makan ikan");
  }
}

public class Inheritence {
  public static void main(String[] args) {
    Hewan hewan = new Hewan();
    hewan.makan();

    Kucing kucing = new Kucing();
    kucing.makan();
  }
}
