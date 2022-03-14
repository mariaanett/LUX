public class Kaart {
    String tugevus;
    Character mast;
    Integer indeks;

    public String getTugevus() {
        return tugevus;
    }

    public void setTugevus(String tugevus) {
        this.tugevus = tugevus;
    }

    public Character getMast() {
        return mast;
    }

    public void setMast(Character mast) {
        this.mast = mast;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    public Kaart(String tugevus, Character mast, Integer indeks) {
        this.tugevus = tugevus;
        this.mast = mast;
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return tugevus + mast;
    }
}
