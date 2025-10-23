package work3.gui;

/**
 * Window — конкретна абстракція для вікна.
 */
public class Window extends GUIElement {

    public Window(GUIRenderer renderer, String title, int x, int y, int width, int height) {
        super(renderer, title, x, y, width, height);
    }

    @Override
    public void draw() {
        renderer.render("WINDOW", text, x, y, width, height);
    }

    @Override
    public String getDescription() {
        return "Window \"" + text + "\" via " + renderer.getClass().getSimpleName();
    }

    /**
     * Заглушка.
     */
    public void save() {
        System.out.println("Window.save(): збережено вікно \"" + text + "\"");
    }
}
