
public class Main {
    public static void main(String[] args) {
        String inputText = "I will be a good programmer.\\nIt was very diffcult.\\n";
        Composite book = new Composite();
        Parser parserBlocks = new ParserBlocks();
        book.parser = parserBlocks;
        book.componentArrayList = book.parser.getArrayListComponents();

    }
}
