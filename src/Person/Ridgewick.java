package Person;

import Enum.*;

public class Ridgewick extends Person {
    public Ridgewick() {
        super("Риджвик", 100, 40, Gender.MAN, Status.CALM);
    }

    public void toOpen(Person person) {
        if (person.status == status.DEAD) {
            person.status.setStatus(Status.OPEN);
            System.out.println(name + " вскрыл " + person.getName());
        }
    }
}
