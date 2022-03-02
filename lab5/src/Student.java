public class Student {
    int id;
    String sName;
    String SMajor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSMajor() {
        return SMajor;
    }

    public void setSMajor(String SMajor) {
        this.SMajor = SMajor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", SMajor='" + SMajor + '\'' +
                '}';
    }

    public Student(int id, String sName, String SMajor) {
        this.id = id;
        this.sName = sName;
        this.SMajor = SMajor;
    }
}
