class CreateClass_4 {
    public static void main(String[] args) {

        AAA obj1=new AAA();
        BBB obj2=new BBB();
        CCC obj3=new CCC();
        DDD obj4=new DDD();
    }
}

class AAA {
  public void printstmt() {
    System.out.println("subclass1");
  }
}

class BBB {
    public void printstmt() {
      System.out.println("subclass2");
    }
  }


  class CCC {
    public void printstmt() {
      System.out.println("subclass3");
    }
  }

  class DDD {
    public void printstmt() {
      System.out.println("subclass4");
    }
  }