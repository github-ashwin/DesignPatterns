abstract class ReportTemplate {
    public final void generateReport() {
        fetchData();
        format();
        print();
    }

    abstract void fetchData();
    abstract void format();
    void print() {
        System.out.println("Printing report...");
    }
}

class PDFReport extends ReportTemplate {
    void fetchData() { System.out.println("Fetching PDF data"); }
    void format() { System.out.println("Formatting PDF"); }
}

public class Main {
    public static void main(String[] args) {
        ReportTemplate report = new PDFReport();
        report.generateReport();
    }
}
