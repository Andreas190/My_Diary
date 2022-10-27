public class Animal {
     final String type;
     private int age;
     //Sätter värdet på animal.age
    public void setAge(int age) {
        this.age = age;
    }
    // Hämtar värdet animal.age
    public int getAge() {
        return age;
    }

    public Animal(String type) {
        this.type = type;
    }

    void makeSound(){
        System.out.println("Djuret låter");
    }
}
