
package HomeWork_1;
import java.util.LinkedList;
import java.util.Queue;
public class Market implements MarketBehaviour {
    private Queue<Person> queue = new LinkedList<>();
    public void enqueue(Person person) {
        queue.add(person);
    }
    public Person dequeue() {
        if (!queue.isEmpty()){
            return queue.poll();
        }
        return null;
    }
    public void addPerson(Person person) {
        enqueue(person);
    }
    public void removePerson(Person person) {
        if (person !=null){
            queue.remove(person);
        }
    }
    public void update() {
        // обновить состояние магазина...
        processOrders();
    }
   public void processOrders(){
        while ((!queue.isEmpty())){
            Person person = dequeue();
            // Обработать заказ персоны
        }
   }
   public boolean hasPerson(Person person){
        return queue.contains(person);
   }
   public void processOrder(Person person){
        //Реализация обработки заказа для данного человека
   }
}

