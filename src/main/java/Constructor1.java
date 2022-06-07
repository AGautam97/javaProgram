
public class Constructor1 {
  private String name;
  private int age;
  private  int salary;
  
  Constructor1(String name, int age, int salary){
	  this.name = name;
	  this.age = age;
	  this.salary = salary;
  }
  public String setName() {
	  System.out.println(name);
	  return name;
  }
  public int setAge() {
	  return age;
  }
  public int setSalary() {
	  return salary;
  }
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1("Aradhana",25,30000);
		Constructor1 c2 = new Constructor1 ("Vikas", 32, 150000);
		c1.setName();
		System.out.println(c1.setAge());
		System.out.println(c1.setSalary());
		c2.setName();
		System.out.println(c2.setAge());
		System.out.println(c2.setSalary());
	}

}
