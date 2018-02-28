package proxy.virtualProxy;

import proxy.virtualProxy.Icon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by liqianga on 2018/2/27.
 */
public class ImageProxy implements Icon {

    ImageIcon icon;
    URL imageUrl;
    boolean receive = false;
    Thread thread;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getHeight() {
        if (icon == null) {
            return 400;
        } else {
            return icon.getIconHeight();
        }
    }

    public int getWidth() {
        if (icon == null) {
            return 800;
        } else {
            return icon.getIconWidth();
        }
    }

    public void painticon(final Component c, Graphics g, int x, int y) {
        if (icon == null) {
            g.drawString("Load....",x+300,y+190);
            if (!receive) {
                receive = true;
                thread = new Thread(
                        new Runnable() {
                            public void run() {
                                icon = new ImageIcon(imageUrl);
                                c.repaint();
                            }
                        }
                );
                thread.start();
            }
        } else {
            icon.paintIcon(c, g, x, y);
        }
    }
}
