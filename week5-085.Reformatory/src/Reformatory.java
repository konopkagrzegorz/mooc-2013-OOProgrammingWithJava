public class Reformatory {
    
    private int counter = 0;

    public int weight(Person person) {
        this.counter++;
        return person.getWeight();
        // return the weight of the person
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }

    public int totalWeightsMeasured() {
        return counter;
    }
}
