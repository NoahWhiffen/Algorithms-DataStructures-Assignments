// Noah Whiffen - SD 12
// Animal Shelter/ Queue Assignment
// July 10th, 2025

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

    }

    public Animal dequeueAny() {

    }

    public Dog dequeueDog() {

    }

    public Cat dequeueCat() {

    }

}