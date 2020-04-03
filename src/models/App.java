package models;

public class App {
	public static void main(String[] args) {
		Dept d = new Dept();
		d.deptno = 10;
		d.dname = "ACCOUNTING";
		d.loc = "CHICAGO";
		
		Emp emp = new Emp();
		emp.empno = 7469;
		emp.ename = "CLERK";
		emp.sal = 800;
		emp.dept = d;

	}
}
