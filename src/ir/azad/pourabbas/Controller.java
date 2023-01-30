package ir.azad.pourabbas;

public class Secondary {
    public static void main(String []args){


        /*Random  random = new Random();
        int i = 1;
        while(i<=100) {
            char x = (char) random.nextInt();
            System.out.print(x);
            i++;
        }*/


        /*String s;
        System.out.println("type in your desired season in persian:");
        Scanner reader = new Scanner(System.in);
        s = reader.next();
        switch (s){
            case "bahar":
                System.out.println("farvardin, ordibehesht, khordad");
                break;
            case "tabestan":
                System.out.println("tir, mordad, shahrivar");
                break;
            case "paeiz":
                System.out.println("mehr, aban, azar");
                break;
            case "zemestan":
                System.out.println("dey, bahman, esfand");
            default:
                System.out.println("error: type in correctly");
        }*/
        Person person = new Person();
        person.setName("Zeinab");
        person.setAge(20);
        person.setAvg(18.86);
        person.setMale(false);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAvg());
        System.out.println(person.isMale());
    }
}
