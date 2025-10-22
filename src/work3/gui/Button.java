package work3.gui;

/**
 * Button — конкретна абстракція (RefinedAbstraction) для кнопки.
 * Реалізує draw() через renderer.render(...).
 */
public class Button extends GUIElement {

    public Button(GUIRenderer renderer, String text, int x, int y, int width, int height) {
        super(renderer, text, x, y, width, height);
    }

    @Override
    public void draw() {
        // Метод, що реалізує шаблон — делегує виклик до реалізатора.
        renderer.render("BUTTON", text, x, y, width, height);
    }

    @Override
    public String getDescription() {
        return "Button \"" + text + "\" via " + renderer.getClass().getSimpleName();
    }

    /**
     * Заглушка для обробника натискання.
     */
    public void click() {
        System.out.println("Button.click(): натиснута кнопка \"" + text + "\"");
    }
}
