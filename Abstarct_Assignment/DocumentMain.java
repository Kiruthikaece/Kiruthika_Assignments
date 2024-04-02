class DocumentMain {
    public static void main(String[] args) {
        Document doc1=new PDFDocument();
        doc1.openDoc();
        doc1.closeDoc();
        Document doc2=new TextDocument();
        doc2.openDoc();
        doc2.closeDoc();
        Document doc3=new ImageDocument();
        doc3.openDoc();
        doc3.closeDoc();
        doc3.saveDoc();
    }
}
abstract class Document {
    abstract String documentType();
    abstract void openDoc();
    abstract void closeDoc();

    public void saveDoc() {
        System.out.println("Document saved...");
    }
}

class PDFDocument extends Document{

    @Override
    String documentType() {
      return "Pdf format";
    }

    @Override
    void openDoc() {
       System.out.println("PDFDocument opened");
    }

    @Override
    void closeDoc() {
        System.out.println("PDFDocument closed");
    }

}
class TextDocument extends Document{

    @Override
    String documentType() {
      return "Text format";
    }

    @Override
    void openDoc() {
       System.out.println("TextDocument opened");
    }

    @Override
    void closeDoc() {
        System.out.println("TextDocument closed");
    }

}
class ImageDocument extends Document{

    @Override
    String documentType() {
      return "Image format";
    }

    @Override
    void openDoc() {
       System.out.println("ImageDocument opened");
    }

    @Override
    void closeDoc() {
        System.out.println("ImageDocument closed");
    }

}