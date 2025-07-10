// Noah Whiffen - SD 12
// Animal Shelter/ Queue Assignment
// July 10th, 2025

package AnimalShelter;

public class Main {
public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Sparky"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Cat("Jasper"));
        shelter.enqueue(new Cat("Patches"));
        shelter.enqueue(new Dog("Zoe"));
        shelter.enqueue(new Cat("Cookie"));
        shelter.enqueue(new Dog("Freya"));
        shelter.enqueue(new Cat("Skittles"));
      
        System.out.println("Dequeue Any: " + shelter.dequeueAny().getName());
        System.out.println("Dequeue Cat: " + shelter.dequeueCat().getName());
        System.out.println("Dequeue Dog: " + shelter.dequeueDog().getName());
        System.out.println("Dequeue Any: " + shelter.dequeueAny().getName());
    }
}
