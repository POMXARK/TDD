public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
