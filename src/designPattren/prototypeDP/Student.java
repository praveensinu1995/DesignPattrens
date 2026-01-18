package designPattren.prototypeDP;

public class Student implements protoType<Student> {
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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(Student student){
        this.id=student.getId();
        this.name=student.getName();
    }
    public Student copy(){
        return new Student(this);
    }
}
