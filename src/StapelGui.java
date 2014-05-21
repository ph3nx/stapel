import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StapelGui {

	private JFrame frame;
	private JTextField t;
	private Stapel s;
	private JLabel l;
	private JLabel anzahl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StapelGui window = new StapelGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StapelGui() {
		s = new Stapel(10);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPush = new JButton("push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String wort = t.getText();
				s.reinlegen(wort);
				t.setText("");
				l.setText(wort + " hinzugefügt.");
				anzahl.setText("Anzahl beträgt: " + s.anzahl());
			}
		});
		frame.getContentPane().add(btnPush);
		
		JButton btnPop = new JButton("pop");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String wort = s.rausholen();
				l.setText(wort + " gelöscht.");
				anzahl.setText("Anzahl beträgt: " + s.anzahl());
			}
		});
		frame.getContentPane().add(btnPop);
		
		t = new JTextField();
		frame.getContentPane().add(t);
		t.setColumns(10);
		
		l = new JLabel("Label");
		frame.getContentPane().add(l);
		
		anzahl = new JLabel("Der Stapel ist Leer.");
		frame.getContentPane().add(anzahl);
	}

}
