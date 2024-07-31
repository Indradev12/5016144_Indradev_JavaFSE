public class Test {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new pdfDocument();
        pdfFactory.createDocument();

        DocumentFactory wordFactory = new wordDocument();
        wordFactory.createDocument();

        DocumentFactory excelFactory = new excelDocument();
        excelFactory.createDocument();
    }
}
