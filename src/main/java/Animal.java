public class Animal {
    int wight;
    boolean hungry;
    int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void sound(){
        System.out.println("Crickets is playing in the background");
    }


    public boolean eat(Object food){
        return true;
    }
}
