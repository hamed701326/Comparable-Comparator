
import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int numberVote;
    Person(String name,int numberVote){
        this.name=name;
        this.numberVote=numberVote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberVote() {
        return numberVote;
    }

    public void setNumberVote(int numberVote) {
        this.numberVote = numberVote;
    }

    @Override
    public int compareTo(Person o) {
        //ascending order
        return this.numberVote-o.getNumberVote();
        //descending order
        // return o.getNumberVote()-this.numberVote
    }
    public static Comparator<Person> PersonNameComparator
            =new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            String personName1=o1.getName().toUpperCase();
            String personName2=o2.getName().toUpperCase();
            return personName1.compareTo(personName2);
        }
    };
}
