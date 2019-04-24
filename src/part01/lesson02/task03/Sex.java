package part01.lesson02.task03;

public enum  Sex {

    MAN,
    WOMAN;

    public static Sex getSex(boolean value) {
        if (value) {
            return WOMAN;
        } else {
            return MAN;
        }
    }
}
