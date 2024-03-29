public class Person {
    private String name;
    private int age;
    private int day;
    public Person() {
        
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age; 
    }
    public int getage() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return name.equals(((Person) o).name);
    }
}
