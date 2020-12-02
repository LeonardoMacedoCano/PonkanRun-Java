package ponkanrun;

import javax.swing.JFrame;

import ponkanrun.Modelo.Fase;

public class Container extends JFrame {

	public Container() {
		add(new Fase());
		setTitle("Ponkan Run");
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}

	public static void main (String []args) {
		new Container();
	}
}
