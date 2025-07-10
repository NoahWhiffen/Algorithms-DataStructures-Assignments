package AnimalShelter;

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "Cat (Name: " + getName() + " Order in Queue: " + getOrder() + ")";
    }
}

