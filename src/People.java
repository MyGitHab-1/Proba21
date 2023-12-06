public class People {

    private int age;
    private String name;

    {
        age = 18;
        name = "Some name";
        System.out.println("Я родился");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=18){
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (!name.equals("")){
           this.name = name;
       }
    }
    public void info(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}
