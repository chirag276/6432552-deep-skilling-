public class PdfFactory extends DocumentFactory {
    public IDocument createDocument() {
        return new PdfDocument();
    }
}
