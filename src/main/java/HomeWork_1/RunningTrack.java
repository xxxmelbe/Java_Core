package HomeWork_1;

public class RunningTrack extends Obstaclable {
    int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "беговую дорожку длиной " + length + " м";
    }
}
