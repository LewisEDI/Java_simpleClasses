public class Bottle {

    private int volume;

    public Bottle(){
        this.volume = 100;
    }

    public int drink(){
        return this.volume - 10;

    }

    public int volumeCheck(){
        return this.volume;

    }

    public int empty(){
        this.volume = 0;
        return this.volume;

    }

    public int fill(){
        this.volume = 100;
        return this.volume;

    }

}
