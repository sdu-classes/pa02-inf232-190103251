class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("Elephant");
        System.out.println(animal);
        
        Mammal mammal = new Mammal("Horse");
        System.out.println(mammal);

        Cat cat = new Cat("Lily");
        System.out.println(cat);
        cat.greets();

        Dog dog = new Dog("Cooper");
        Dog dog2 = new Dog("Max");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog2);
        
    }
}