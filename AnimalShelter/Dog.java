package AnimalShelter;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog (Name: " + getName() + " Order in Queue: " + getOrder() + ")";
    }
}
