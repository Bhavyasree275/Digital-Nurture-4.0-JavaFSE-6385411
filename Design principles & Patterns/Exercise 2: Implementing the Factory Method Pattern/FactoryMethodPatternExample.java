//created an interface document  for different document types
interface Document {
    void open();
}


class WordDocument implements Document {
    public void open() {
        System.out.println("Opening a Word Document.");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF Document.");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel Document.");
    }
}
//creating an abstract class documentfactory
abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}


public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
