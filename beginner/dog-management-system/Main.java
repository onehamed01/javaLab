class Main{
    public static void main(String[] args){
        Dog wolf = new Dog("Wolf", 3);
        Dog mike = new Dog("Mike", 3);
        Dog tyni = new Dog("Tyni", 3);
        Dog mia = new Dog("Mia", 3);
        Dog nef = new Dog("Nef", 3);
        Dog testi = new Dog("testi", 3);

        Dog[] dogList = {wolf, mike, tyni, mia, nef, testi};
        
        for (int idx = 0; idx < dogList.length; idx++){
            dogList[idx].burk();
        }
    }

}
class Dog{
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    void burk(){
        System.out.println(
            "Hello, my name is "+name+" and I'm "+age+" years old."
        );
    }
}