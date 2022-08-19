public class Box <T ,S> {
    private T id;
    private S name;

    public Box(T id, S name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public static <T ,S>void generic(T t, S s) {
    System.out.println(t);
        System.out.println(s);
}

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
