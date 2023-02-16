package enums;

public enum Food {
    COCACOLA("кока-кола", 250),
    BEER("пиво", 110),
    SANDWICH("сэндвич с тунцом", 500);
    private String title;
    public int calories;

    public String getTitle() {
        return title;
    }

    Food(String title, int calories) {
        this.title = title;
        this.calories = calories;
    }
}
