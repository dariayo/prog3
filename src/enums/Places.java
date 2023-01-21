package enums;

public enum Places {
    MORGUE("морг"),
    NORTHLUDLOW("Норт-Ладлоу"),
    LUDLOW("Ладлоу"),
    BERGENFIELD("Бергенфилд"),
    CABINET("кабинет"),
    NEWARK("Ньюарк"),
    CEMETRY("кладбище"),
    CAFE("кафе"),
    TABLE("стол"),
    BUCKET("ведро"),
    DISCO("дискотека");
    private String description;
    Places(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
