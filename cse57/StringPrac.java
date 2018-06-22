class StringPrac {
  public static void main(String args[]) {
    for(int i=1; i<=100; i++) {
      if(i%3 == 0 && i%5 != 0)
        System.out.println("Jonny");

      else if(i%5 == 0 && i%3 != 0 )
        System.out.println("Walker");

      else if(i%5 == 0 && i%3 == 0)
        System.out.println("Jonny Walker");
      else
        System.out.println(i);
    }
  }
}
