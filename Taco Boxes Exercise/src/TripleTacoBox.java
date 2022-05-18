public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    // Returns number of tacos remaining in the box
    public int tacosRemaining() {
        return this.tacos;
    }

    // Removes a taco from the box upon consumption. Cannot be negative
    public void eat() {
        if (this.tacos > 0) {
            this.tacos -= 1;
        } else if (this.tacos < 0) {
            this.tacos = 0;
        }
    }
}