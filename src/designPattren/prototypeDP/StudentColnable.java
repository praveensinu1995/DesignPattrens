package designPattren.prototypeDP;

public class StudentColnable implements Cloneable  {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentColnable(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public StudentColnable(StudentColnable student){
        this.id=student.getId();
        this.name=student.getName();
    }
    @Override
    public StudentColnable clone() {
        return new StudentColnable(this.id, this.name);
    }
}
