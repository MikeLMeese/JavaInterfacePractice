public class Main {
    public static void main(String[] args) throws Exception {
        // Test your code here!

        TripleTacoBox threePiece = new TripleTacoBox();
        threePiece.eat();
        threePiece.eat();
        threePiece.eat();
        threePiece.eat();
        System.out.println(threePiece.tacosRemaining());

        CustomTacoBox sixPieceSpecial = new CustomTacoBox(6);
        sixPieceSpecial.eat();
        System.out.println(sixPieceSpecial.tacosRemaining());
    }
}
