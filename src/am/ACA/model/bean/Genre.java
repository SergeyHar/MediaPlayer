package am.ACA.model.bean;


public enum Genre {
    JAZZ(1),
    CLASSIC(2),
    ROCK(3),
    REGGAE(4);
    int id;

    public int getId() {
        return id;
    }

    Genre(int id) {
        this.id = id;
    }
}
