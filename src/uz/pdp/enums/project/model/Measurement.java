package uz.pdp.enums.project.model;

public enum Measurement {
    KG("kg"),
    PIECE("dona");

    String uzbVersion;

    Measurement(String uzbVersion) {
        this.uzbVersion = uzbVersion;
    }

    public String getUzbVersion() {
        return uzbVersion;
    }
}
