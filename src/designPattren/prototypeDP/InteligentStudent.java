package designPattren.prototypeDP;

public class InteligentStudent extends Student {
    private int iq;
    public InteligentStudent(int id, String name,int iq) {
        super(id, name);
        this.iq=iq;
    }

    @Override
    public String toString() {
        return super.toString()+" InteligentStudent{" +
                "iq=" + iq +
                '}';
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public InteligentStudent(InteligentStudent student){
        super(student);
        this.iq=student.iq;
    }
    public InteligentStudent copy(){
        return new InteligentStudent(this);
    }
}
