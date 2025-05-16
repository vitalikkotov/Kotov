// Интерфейс стратегии
interface PrintStrategy {
    void print(String document);
}

// Конкретная стратегия для черно-белой печати
class BlackAndWhitePrintStrategy implements PrintStrategy {
    @Override
    public void print(String document) {
        System.out.println("Печать документа в черно-белом варианте: " + document);
    }
}

// Конкретная стратегия для цветной печати
class ColorPrintStrategy implements PrintStrategy {
    @Override
    public void print(String document) {
        System.out.println("Печать документа в цвете: " + document);
    }
}

// Класс принтера
class Printer {
    private PrintStrategy printStrategy;

    public Printer(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void printDocument(String document) {
        printStrategy.print(document);
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(new BlackAndWhitePrintStrategy());
        printer.printDocument("Документ 1");

        // Меняем стратегию на цветную печать
        printer.setPrintStrategy(new ColorPrintStrategy());
        printer.printDocument("Документ 2");
    }
}
