package proxy;

import java.awt.*;

/**
 * Created by liqianga on 2018/2/27.
 */
public interface Icon {
    int getWidth();
    int getHeight();
    void painticon(Component c, Graphics g, int x, int y);
}
