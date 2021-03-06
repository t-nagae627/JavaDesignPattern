package adapter.transfer;

import adapter.extend.Banner;

/**
 * Adapter役(AdapteeをTargetに変換)
 */
public class PrintBanner extends Print {

    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
