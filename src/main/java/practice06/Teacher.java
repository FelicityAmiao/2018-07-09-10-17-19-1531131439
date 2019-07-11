package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String classShow = this.klass == 0 ? "teach No Class" : "teach Class " + this.klass;
        return getTeacherIntroduction(classShow);
    }

    private String getTeacherIntroduction(String msg) {
        return super.introduce() + " I am a Teacher. I " + msg + ".";
    }
}
