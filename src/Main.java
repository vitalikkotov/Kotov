import java.util.ArrayList;
import java.util.List;

// Класс, представляющий месяц
class Month {
    private String name;
    private int numberOfDays;

    public Month(String name, int numberOfDays) {
        this.name = name;
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    @Override
    public String toString() {
        return name + " (" + numberOfDays + " дней)";
    }
}

// Класс, представляющий год, содержащий список месяцев
class Year {
    private int yearNumber;
    private List<Month> months;

    public Year(int yearNumber) {
        this.yearNumber = yearNumber;
        this.months = new ArrayList<>();
        initializeMonths();
    }

    // Инициализация месяцев для стандартного невисокосного года
    private void initializeMonths() {
        months.add(new Month("Январь", 31));
        months.add(new Month("Февраль", 28));
        months.add(new Month("Март", 31));
        months.add(new Month("Апрель", 30));
        months.add(new Month("Май", 31));
        months.add(new Month("Июнь", 30));
        months.add(new Month("Июль", 31));
        months.add(new Month("Август", 31));
        months.add(new Month("Сентябрь", 30));
        months.add(new Month("Октябрь", 31));
        months.add(new Month("Ноябрь", 30));
        months.add(new Month("Декабрь", 31));

        // Для високосного года можно добавить проверку и изменить февраль на 29 дней
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public List<Month> getMonths() {
        return months;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Год: ").append(yearNumber).append("\n");
        for (Month month : months) {
            sb.append(month).append("\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект года, например, 2024
        Year year2024 = new Year(2024);

        // Вывод информации о году и его месяцах
        System.out.println(year2024);

        // Можно создать несколько объектов-месяцев отдельно, если нужно
        Month customMonth = new Month("Мой месяц", 15);
        System.out.println(customMonth);

        // Или добавить их в год по необходимости
    }
}