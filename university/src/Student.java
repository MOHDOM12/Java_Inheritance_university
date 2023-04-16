public class Student extends Teachers implements University{

    public Student() {
    }

    public Student(String names, int ID, String passWord) {
        super(names, ID, passWord);
    }

    @Override
    public void print() {
        super.print();
    }
}
