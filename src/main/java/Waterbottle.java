public class Waterbottle {
    private int capacity = 100;
    private int volume;

    public Waterbottle(){
        this.volume = capacity;
    }

    public int drink(){
        volume = volume - 10;
        return this.volume;
    }

    public int empty(){
        volume = 0;
        return this.volume;
    }

    public int fill(){
        volume = 100;
        return this.volume;
    }
}
