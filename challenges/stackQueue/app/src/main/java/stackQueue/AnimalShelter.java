package stackQueue;

import data.Node;

public class AnimalShelter {
    private QueueLinkedList<Integer> dog;
    private QueueLinkedList<Integer> cat;

    AnimalShelter() {
        this.dog = new QueueLinkedList<>();
        this.cat = new QueueLinkedList<>();
    }

    public void enqueue(int animal) {
        //if 
            this.dog.enqueue(animal);
        //else
            this.cat.enqueue(animal);
    }
}
