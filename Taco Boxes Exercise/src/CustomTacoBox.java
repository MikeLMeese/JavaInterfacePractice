public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox (int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0) {
            this.tacos -= 1;
        } else if (this.tacos < 0) {
            this.tacos = 0;
        }
    }
}