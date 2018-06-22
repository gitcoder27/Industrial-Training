class Pattern {
  public static void main(String agrs[]) {

    for(int i=1; i<=7; i++) {
      for(int k=1; k<=i; k++)
        System.out.print(k);
      for(int j=i; j<7; j++)
        System.out.print("*");
      System.out.print("\n");
    }
  }
}
