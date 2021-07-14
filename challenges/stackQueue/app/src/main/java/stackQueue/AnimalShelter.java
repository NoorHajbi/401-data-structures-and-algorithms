package stackQueue;

public class AnimalShelter {
    private final QueueLinkedList<Animal> dog;
    private final QueueLinkedList<Animal> cat;

    public AnimalShelter() {
        this.dog = new QueueLinkedList<>();
        this.cat = new QueueLinkedList<>();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            this.dog.enqueue(animal);
        } else if (animal instanceof Cat) {
            this.cat.enqueue(animal);
        }
    }

    public Animal dequeue(String pref) {
        if (pref.equals("cat")) {
            return this.cat.dequeue();
        } else if (pref.equals("dog")) {
            return this.dog.dequeue();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        //will be full at enqueue and empty in dequeue
        if (cat.front != null)
            return cat.toString();

            //will be empty at enqueue and full in dequeue
        else if (dog.front != null)
            return dog.toString();
        else
            return "Please fill the queue";
    }

}
