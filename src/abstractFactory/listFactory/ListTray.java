package abstractFactory.listFactory;

import abstractFactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>\n");
        stringBuilder.append(caption);
        stringBuilder.append("\n<ul>\n");
        tray.forEach(item -> {
            stringBuilder.append(item.makeHTML());
        });
        stringBuilder.append("</ul>\n");
        stringBuilder.append("</li>\n");

        return stringBuilder.toString();
    }

}
