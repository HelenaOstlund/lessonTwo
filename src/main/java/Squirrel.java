class Squirrel extends Animal {
    int numOfConesInNest;

    @Override
    public boolean eat(Object cone) {

        return true;
    }

    public void makeSound(){
        System.out.println("Squirrel " + getId() + " is squeak squeaking");
    }
    @Override
    public void sound(){
        makeSound();
    }
}

