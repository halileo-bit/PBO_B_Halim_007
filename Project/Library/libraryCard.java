package Project.Library;

public class libraryCard {
    String id, expiryDate;

    public libraryCard(String id, String expiryDate) {
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public String getId() {
        return id;
    }
}
