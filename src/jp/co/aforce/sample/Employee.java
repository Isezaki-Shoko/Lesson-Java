package jp.co.aforce.sample;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,int salary) {
		this.id = id;
		this.name= name;
		this.salary= salary;
	}
	
	public void raiseSalary(double percent) {
		salary=salary + (salary*percent/100);
		
		System.out.println("昇給後の給与：" + salary +"円");
		
	}
}
