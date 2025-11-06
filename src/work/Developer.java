package work;

public class Developer extends Employee{


    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {

        System.out.printf("Это %s. Он разраб. %n" +
                "Сегодня %s очень занят: он фиксит баги, которые сделал вчера.%n" +
                "Поэтому зарплата у него такая: %d рублей%n", name, name, salary);
    }
}
