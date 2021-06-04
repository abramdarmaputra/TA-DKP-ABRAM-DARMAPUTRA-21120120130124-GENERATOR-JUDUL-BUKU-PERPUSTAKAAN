public class konjungsi {
    private static final String[] conjunctions = {
            "di", "ke", "dari", "dan", "atau", "tetapi", "sedangkan", "melainkan", "lalu", "kemudian", "padahal", "dengan", "serta", "namun", "bahkan", "sebaliknya", "hanya"
    };

    public static boolean isConjunction(final String word) {
        for (String conjunction : conjunctions) if (conjunction.equals(word)) return true;
        return false;
    }
}
