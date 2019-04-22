package part01.lesson02.task03;

public enum  Sex {

    MAN("man"),
    WOMAN("woman");

    private final String code;

    Sex(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Sex getSex(boolean value) {
        if (value) {
            return WOMAN;
        } else {
            return MAN;
        }
    }
}
