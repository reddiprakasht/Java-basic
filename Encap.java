class Employee {
    private int x; // data hiding

    public void setEmpid(int empid) {
        x = empid;
    }

    public int getEmpid() {
        return x;
    }
}

public class Encap {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmpid(100);
        System.out.println(obj.getEmpid());
    }
}
