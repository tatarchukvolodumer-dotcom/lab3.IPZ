package work3.gui;

/**
 * GtkRenderer — приклад конкретної реалізації GUIRenderer для GTK.
 * Заглушка.
 */
public class GtkRenderer implements GUIRenderer {

    @Override
    public void render(String type, String text, int x, int y, int width, int height) {
        System.out.println("[GTK] render " + type
                + " text=\"" + text + "\""
                + " x=" + x + " y=" + y
                + " w=" + width + " h=" + height);
    }
}
