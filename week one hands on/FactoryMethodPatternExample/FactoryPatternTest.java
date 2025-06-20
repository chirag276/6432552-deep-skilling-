public class FactoryPatternTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        IDocument wordDoc = wordFactory.createDocument();
        wordDoc.display();

        DocumentFactory pdfFactory = new PdfFactory();
        IDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.display();

        DocumentFactory excelFactory = new ExcelFactory();
        IDocument excelDoc = excelFactory.createDocument();
        excelDoc.display();
    }
}
