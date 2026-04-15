package Parte_b.clasesejercicio1anteriores;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
