package work;

public class Manager extends Employee{

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {

        System.out.printf("Это %s. Он РП. %n" +
                "Сегодня %s очень занят.%n" +
                "Он думает, чем  занять разработчиков, чтобы они не успели запушить новых багов%n" +
                "к завтрашней сдаче ЗНИ.%n" +
                "Работа у РП тяжелая. Поэтому и зарплата у него большая: %d рублей%n%n", name, name, salary);
    }
}
