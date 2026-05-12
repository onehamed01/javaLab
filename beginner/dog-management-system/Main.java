class Main{
    public static void main(String[] args) {
        Dog wolfDog = new Dog("Wolf", 4);

        wolfDog.bark();
    }
}
class Dog{
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    void bark(){
        System.out.println(
        "Hello my name is "+name+
        ". I'm"+age+
        " years old.");
    }

}