package work3.gui;

/**
 * GUIElement — абстракція елементу інтерфейсу (частина Bridge).
 * Містить посилання на GUIRenderer (implementor). Абстракція містить загальні
 * властивості (позиція, розмір, текст) і абстрактний метод draw(), реалізація
 * якого делегує виклик renderer'у.
 *
 * Учасник шаблону: Abstraction.
 */
public abstract class GUIElement {
    protected final GUIRenderer renderer;
    protected int x, y, width, height;
    protected String text;

    public GUIElement(GUIRenderer renderer, String text, int x, int y, int width, int height) {
        this.renderer = renderer;
        this.text = text;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Виконати малювання елементу (делегується реалізатору).
     */
    public abstract void draw();

    /**
     * Повертає текстовий опис елемента.
     */
    public abstract String getDescription();

    // Допоміжні сеттери
    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    public void setSize(int w, int h) { this.width = w; this.height = h; }
    public void setText(String t) { this.text = t; }
}
