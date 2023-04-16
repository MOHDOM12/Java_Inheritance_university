import java.util.Scanner;
import java.io.Console;
public class Teachers implements University{
    Scanner s = new Scanner(System.in);
    protected String Names;
    protected int ID;
    protected String passWord;

    public Teachers()
    {

    }
    public Teachers(String names, int ID, String passWord) {
        Names = names;
        this.ID = ID;
        this.passWord = passWord;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }

    @Override
    public void ID() {
        System.out.println("Enter your ID :");
        ID = s.nextInt();
    }


    @Override
    public void Names() {
        System.out.println("Enter your name :");
        Names = s.next();
    }

    @Override
    public void passWord()
    {
        System.out.println("Enter your PassWord");
        passWord = s.next();
    }

    @Override
    public void print() {
        System.out.println("Your ID is : " +ID);
        System.out.println("Your name is : " +Names);
        System.out.println("Your passWord is : " +passWord);
    }

}
