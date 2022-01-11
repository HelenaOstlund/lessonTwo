class Owl extends Animal {
    int wingSpan;

    @Override
    public boolean eat(Object Squirrel) {

        return true;
    }
    public void makeSound(){
        System.out.println("Owl " + getId() + " is hoot hooting");
    }
    @Override
    public void sound(){
        makeSound();
    }

}

