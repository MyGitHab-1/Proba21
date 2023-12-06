public class Main {
    public static void main(String[] args) {

        People p = new People();
        p.setAge(10);
        p.setName("");

        p.info();

        p.setAge(20);
        p.setName("Марк");

        p.info();

    }
}