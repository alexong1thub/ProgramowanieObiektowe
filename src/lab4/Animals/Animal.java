package lab4.Animals;

public class Animal {
    int age;
    String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return getClass() +  " {name = " + name + "\nage = " + age+"}";
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null || this.getClass() != other.getClass()){
            return false;
        }
        Animal animal = (Animal) other;
        return this.getAge() == animal.getAge() && this.getName().equals(animal.getName());
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
