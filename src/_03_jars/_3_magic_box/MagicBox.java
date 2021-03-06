package _03_jars._3_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. When the user clicks on a
	 * secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse click
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the
	 * magic_box package) to play sounds, show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use
	 * the mouse position, or the color of the image, then decide what action the
	 * Media Palace should take in each case. backgroundImage.getRGB(e.getX(),
	 * e.getY()) will give you the color of the current pixel.
	 * 
	 * 
	 * 
	 */

	BufferedImage backgroundImage;

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_03_jars/_3_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		MediaPalace m = new MediaPalace();
		if (backgroundImage.getRGB(e.getX(), e.getY()) == -4410751) {
			System.out.println("image color");
			JFrame f = new JFrame();
			f.setVisible(true);
			f.setLocationRelativeTo(null);
			f.setSize(500, 500);
			JPanel p = new JPanel();
			f.add(p);
			String s = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/SNice.svg/1200px-SNice.svg.png";
			JLabel image;
			try {
				image = m.loadImageFromTheInternet(s);

				// JLabel image =
				// m.loadImageFromTheInternet("https://lh3.googleusercontent.com/proxy/0pLekfBqM1ZbsOWXuh8-IgmdMshNpr5iqT89NSgat-dYxd3N1ckz4KoQcS6Umin7c-qaNRCkldu8ZTiosELI2uB9eJ7rN-I");
				p.add(image);
				f.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println(backgroundImage.getRGB(e.getX(), e.getY()));

		// m.loadImageFromWithinProject("money.jpg");
		// m.loadImageFromHardDrive()

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
