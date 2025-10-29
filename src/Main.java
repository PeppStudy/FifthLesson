import shape.Circle;
import shape.Rectangle;
import work.Developer;
import work.Manager;

public class Main {

    public static void main(String[] args) {

        /* • Создайте класс Employee с полями name и salary. Создайте подклассы
        Manager и Developer, которые наследуют от Employee.
        Добавьте метод work() в каждом классе, который выводит сообщение о работе сотрудника.
• Создайте абстрактный класс Shape с абстрактным методом draw().
Создайте подклассы Circle и Rectangle, которые реализуют метод draw().
В методе draw() выведите сообщение о том, что фигура рисуется.
• Отравить в комментарий ссылку на merge request, в котором указаны доработки*/

        System.out.printf("***Это про работу***%n%n");

        Developer developer = new Developer("Павел", 120000);
        Manager manager = new Manager("Василий", 200000);

        developer.work();
        manager.work();

        System.out.printf("***Это про геометрию***%n%n");

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

    }

}
