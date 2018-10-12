package focusgame;

public class NumberGame {

    private String message;

    public NumberGame() {
        message = "";
    }

    void setMessage(String msg) {
        message = msg;
    }

    String getMessage() {
        return message;
    }

    public boolean guess(int number) {
        return false;
    }

    public int getUpperBound() {
        return 0;
    }

     int getCount() {
        return 0;
    }

    public String toString() {
        return "";
    }
}
