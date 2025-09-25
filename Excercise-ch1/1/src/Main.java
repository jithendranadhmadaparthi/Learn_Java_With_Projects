//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String name="Jithendranadh";
        String position="Park Manager";
        System.out.println("My name is "+name+" and I want to be a "+position+" in Mesozoic Eden");
        System.out.println("Welcome Mesozoic Eden");

        int number=5;
        int doubled=doubleNumber(number);
        System.out.println("The doubled number is : "+doubled);
        String openingHours="08:00";
        String closingHours="20:00";
        System.out.println("Park's opening and closing hours are "+openingHours+" and "+closingHours);
        System.out.println("Welcome "+name+" to Mesozoic Eden");
        System.out.println("Mesozoic Eden is safe and secure");
        System.out.println("Surprise Surprise,"+name);
    }
    public  static  int doubleNumber(int number){
        return  number*2;
    }
}