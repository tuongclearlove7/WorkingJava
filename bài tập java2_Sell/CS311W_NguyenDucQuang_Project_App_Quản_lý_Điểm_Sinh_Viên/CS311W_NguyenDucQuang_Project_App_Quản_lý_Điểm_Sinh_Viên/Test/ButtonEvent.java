import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class ButtonEvent extends JPanel implements ActionListener {
    private int row;
    private int col;
    private int bound = 2;
    private int size = 50;
    private JButton[][] btn;
    private Controller controller;
    private Color backGroundColor = Color.lightGray;
    private MainFrame frame;

    public ButtonEvent(MainFrame frame, int row, int col) {
        this.frame = frame;
        this.row = row;
        this.col = col;

        setLayout(new GridLayout(row, col, bound, bound));
        setBackground(backGroundColor);
        setPreferredSize(new Dimension((size + bound) * col, (size + bound)
                * row));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setAlignmentY(JPanel.CENTER_ALIGNMENT);

        newGame();

    }

    public void newGame() {
        controller = new Controller(this.row, this.col);
        addArrayButton();

    }

    private void addArrayButton() {
        btn = new JButton[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                btn[i][j] = createButton(i + "," + j);
                Icon icon = getIcon(controller.getMatrix()[i][j]);
                btn[i][j].setIcon(icon);
                add(btn[i][j]);
            }
        }
    }

    private Icon getIcon(int index) {
        int width = 48, height = 48;
        Image image = new ImageIcon(getClass().getResource(
                "/icon/" + index + ".png")).getImage();
        Icon icon = new ImageIcon(image.getScaledInstance(width, height,
                image.SCALE_SMOOTH));
        return icon;

    }

    private JButton createButton(String action) {
        JButton btn = new JButton();
        btn.setActionCommand(action);
        btn.setBorder(null);
        btn.addActionListener(this);
        return btn;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
