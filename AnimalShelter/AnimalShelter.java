package AnimalShelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Dog> dogs;
    private Queue<Cat> cats;
    private int timestamp;
    private int capacity = 100;

    public AnimalShelter() {
        this.dogs = new LinkedList<>();
        this.cats = new LinkedList<>();
        this.timestamp = 0;
    }

    public boolean isFull() {
        return (dogs.size() + cats.size()) >= capacity;
    }

    public boolean isEmpty() {
        return dogs.isEmpty() && cats.isEmpty();
    }

    public void enqueue(Animal animal) {
        if (isFull()) {
            System.out.println("Shelter is full. Cannot add " + animal.getName());
            return;
        }

        animal.setOrder(timestamp++);

        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else {
            System.out.println("Unknown animal. Cannot enqueue.");
        }
    }

    public Animal dequeueAny() {
        if (isEmpty()) return null;
        if (dogs.isEmpty()) return dequeueCat();
        if (cats.isEmpty()) return dequeueDog();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.getOrder() < cat.getOrder()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }

}