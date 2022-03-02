package actionCoffeeMachine;

public enum Actions {

    BUY("buy"),
    FILL("fill"),
    TAKE("take"),
    REMAINING("remaining"),
    EXIT("exit");

    String answer;

    Actions(String value) {
        this.answer = value;
    }

    public static Actions findByValue(String ans) {
        for (Actions value : values()) {
            if (ans.equals(value.answer)) {
                return value;
            }
        }
        return null;
    }
}
