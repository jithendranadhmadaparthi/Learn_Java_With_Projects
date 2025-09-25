public class Main {
    public static void main(String[] args) {
    //This is single line comment
    /*This is
    Multi-Line
    Comment
     */
        int a=10;//Decimal(0-9)
        int b=0b1010;//binary,prefixed by 0b or 0B
        int c=012;//Octal,Prefixed by 0
        int d=0xa;//Hexadecimal,Prefixed by 0x or 0X
        System.out.println(a+" "+b+" "+c+" "+d);
        String breed="V.Mongoliensis";
        float height=6.6f;//in ft
        float length=6.2f;//in ft
        float weight=90;//in kg
        System.out.println(breed+" "+length+" "+height+" "+weight);
        String d_name="Velociraptor";
        int d_age=13;
        String diet="Carnivores";
        System.out.println(d_name+" "+d_age+" "+diet);
        int max_persons=10;
        System.out.println("There's a maximum of "+max_persons+" people allowed in Mesozoic Eden");
        String emp_name="Jhonny";
        int emp_age=20;
        System.out.println("Employee name is "+emp_name+" and age is "+emp_age);
        int no=10;
        System.out.println("There are "+no+" of dinosaurs in the park");
        int safety=8;
        System.out.println("Park's safety rating is "+safety);
        String d_info=d_name+" "+d_age+" "+diet;
        System.out.println(d_info);
        char ref=d_name.charAt(0);
        System.out.println("Reference to species is "+ref);
    }
}
