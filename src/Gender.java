public enum Gender {
    MALE("Мужчина"),
    FEMALE("Женщина");

    private String name;

    Gender(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}







