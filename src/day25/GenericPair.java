package day25;

public class GenericPair<T> {

    private String key;
    private T value;

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public GenericPair(String key, T value){
        this.key= key;
        this.value=value;

    }

    @Override
    public String toString() {
        return "GenericPair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
