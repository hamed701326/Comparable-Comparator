import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Person [] people=new Person[4];
        people[0]=new Person("hossain",20);
        people[1]=new Person("ali",19);
        people[2]=new Person("mohammad",24);
        people[3]=new Person("mahmoud",11);
        Arrays.sort(people);
        System.out.println(people[3].getName()+" is winner with "+people[3].getNumberVote() +" votes");
    }
}
