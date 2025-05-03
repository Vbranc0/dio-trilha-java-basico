public class Main {
    public static void main(String[] args) throws Exception {
            var male = new Person();
            male.setName("João");
            male.setAge(28);

            var female = new Person();
            female.setName("Angela");
            female.setAge(21);
            
            System.out.println("Nome: " + male.getName() + "; Idade: " + male.getAge());

            System.out.println("Nome: " + female.getName() + "; Idade: " + female.getAge());
    }
}
