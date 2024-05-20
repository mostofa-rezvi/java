package pkg27.testgenerics;

public class Teacher extends Student<Object> {

    private Object name;
    private Object id;
    private Object age;
    private Object salary;

    public Teacher(int par, double par1, String gbfgh, int par2) {
    }

    public Teacher(Object name, Object id, Object age, Object salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public Object getName() {
        return name;
    }

    @Override
    public void setName(Object name) {
        this.name = name;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public void setId(Object id) {
        this.id = id;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + '}';
    }
}
