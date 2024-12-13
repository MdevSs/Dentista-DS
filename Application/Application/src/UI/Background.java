package UI;

import java.awt.*;
import javax.swing.*;

/*Juan Ramon | Leandro Henrique*/

public class Background extends JDesktopPane{
    private Image imagem;
    
    public Background(String imagem) {
        this.imagem = new ImageIcon(imagem).getImage();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
}