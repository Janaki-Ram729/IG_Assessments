package Day3;

class Singleton{
	  public static Singleton s = null;
	  private Singleton(){
	    
	  }
	  public static Singleton getInstance(){
	    if (s == null){
	      s = new Singleton();
	    }
	    return s;
	  }
	}

public class SingleDemo{
	  public static void main(String[] args){
	    Singleton s1 = Singleton.getInstance();
	    Singleton s2 = Singleton.getInstance();
	    System.out.println(s1+" "+s2);
	    System.out.println(s1.hashCode()+" "+s2.hashCode());
	  }
	}