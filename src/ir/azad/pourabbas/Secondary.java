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
        person.setAge(21);
        person.setName("Zeinab");
        person.setAvg(17.26);
        person.setMale(false);
        System.out.println(person.getName());
        System.out.print(person.getAge()+"\n");
        System.out.print(person.getAvg()+"\n");
        System.out.print(person.isMale());
    }
}
