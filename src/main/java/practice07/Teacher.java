package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String classShow = this.klass == null ? "teach No Class" : "teach Class " + this.klass.getNumber();
        return getTeacherIntroduction(classShow);
    }

    private String getTeacherIntroduction(String msg) {
        return super.introduce() + " I am a Teacher. I " + msg + ".";
    }

    public String introduceWith(Student student) {
        return student.getKlass().getNumber() == this.klass.getNumber() ?
                getTeacherIntroduction("teach " + student.getName()) :
                getTeacherIntroduction("don't teach " + student.getName());

    }
}
