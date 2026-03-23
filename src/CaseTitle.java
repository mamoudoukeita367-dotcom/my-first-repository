public class CaseTitle {
    public String titlecase(String sentence) {
        String[] mots = sentence.toLowerCase().split(" ");
        for (int i = 0; i < mots.length; i++) {
            mots[i] = mots[i].substring(0, 1).toUpperCase() + mots[i].substring(1);
        }
        return String.join(" ", mots);
    }

}
