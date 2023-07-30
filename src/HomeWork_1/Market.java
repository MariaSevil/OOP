
package HomeWork_1;
import java.util.LinkedList;
import java.util.Queue;
public class Market implements MarketBehaviour {
    private Queue<Person> queue = new LinkedList<>();
    public void enqueue(Person person) {
        queue.add(person);
    }
    public Person dequeue() {
        return queue.poll();
    }
    public void addPerson(Person person) {
        enqueue(person);
    }
    public void removePerson(Person person) {
        queue.remove(person);
    }
    public void update() {
        // обновить состояние магазина...
    }
}
