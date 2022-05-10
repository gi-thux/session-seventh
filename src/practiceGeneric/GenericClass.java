package practiceGeneric;

public class GenericClass implements Comparable<GenericClass> {

    private String month;
    private Float expenditure;

    public GenericClass(String month,Float expenditure){
        this.month=month;
        this.expenditure=expenditure;
    }


    @Override
    public int compareTo(GenericClass o) {
        return Float.compare(this.expenditure,o.expenditure);
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "month='" + month + '\'' +
                ", expenditure=" + expenditure +
                '}';
    }
}
