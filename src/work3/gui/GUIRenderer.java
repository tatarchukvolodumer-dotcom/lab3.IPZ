package work3.gui;

/**
 * GUIRenderer — інтерфейс реалізації для патерну Bridge.
 * Використовується абстракцією GUIElement для відрисовки елементів у конкретній бібліотеці.
 *
 * Учасник шаблону: Implementor.
 */
public interface GUIRenderer {
    /**
     * Універсальний метод відрисовки елементу.
     * @param type тип елементу (BUTTON, WINDOW, CHECKBOX)
     * @param text текст / заголовок елементу
     * @param x позиція X
     * @param y позиція Y
     * @param width ширина
     * @param height висота
     */
    void render(String type, String text, int x, int y, int width, int height);
}
