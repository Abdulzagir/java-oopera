public enum Gender {
    MALE("Мужчина"),
    FEMALE("Женщина");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return gender;
    }
}







