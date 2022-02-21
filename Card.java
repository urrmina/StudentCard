package ihmProjet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import ihmProjet.student1;

public class Card extends JFrame implements ActionListener {
	
	// Declarations
	Container c;
	JTextField tname, tsurname;
	JRadioButton male, female;
	ButtonGroup gb;
	JComboBox day, month, year, tsp, tys; //ys = years studied, sp= specialty
	// dob= date of birth, yr = years studied
	JLabel add, res, dob, gender, name, title, title2, title3, surname, sp, ys, pic1, pic2, pic3, aname, asurname, adob, agender, asp, ays, ne;
	JTextArea all, readd, tadd;
	JLabel nname, ssurname, ddob, ssp, nne, yys, pic5;
	String s;
	JButton validate, addPic, modify, print; 
	String yss[] = {"2014-2015","2015-2016","2016-2017",
					"2017-2018","2018-2019","2019-2020",
					"2020-2021","2021-2022"};
	String sps[] = {"Informatique", "Mathematique", "Chimie", "Physique"};
	String days[] = {"1", "2", "3", "4", "5", 
					"6", "7", "8", "9","10", 
					"11", "12","13", "14", "15",
					"16", "17", "18", "19","20", 
					"21", "22", "23", "24", "25", 
					"26", "27", "28", "29","30", 
					"31"};
	String years[] = {"1995", "1996", "1997", "1998", "1999", 
					"2000","2001", "2002", "2003", "2004", 
					"2005", "2006", "2007", "2008", "2009", 
					"2010", "2011", "2012", "2013", "2014", 
					"2015", "2016", "2017", "2018", "2019"};
	String months[] = {"Janvier", "Février", "Mars", 
						"Avril", "May", "Juin", 
						"Juillet", "Aoùt", "Septembre", 
						"Octobre", "Novembre", "Décembre"};
	// Declarations ended
	
	public Card() {
		
		// the card parametres
		this.setSize(900, 800);
		this.setTitle("Registration Form");
		this.setLayout(null);
		
		c = getContentPane();
        c.setSize(900, 800);
        c.setLayout(null);
		
		title = new JLabel("Université de  Abdelhamid Ibn Badis");
		title.setFont(new Font("Ariel", Font.PLAIN, 20));
		title.setSize(350, 30); 
        title.setLocation(100, 60);
        title.setForeground(java.awt.Color.darkGray);
        c.add(title);
        
        title3 = new JLabel("Mostaganem");
        title3.setFont(new Font("Arial", Font.PLAIN, 20));
        title3.setSize(300, 30); 
        title3.setLocation(190, 90);
        title3.setForeground(java.awt.Color.darkGray);
        c.add(title3);
		
        // the logo
        String url = "logo.png";
        ImageIcon icone1 = new ImageIcon(url);
        Image image1 = icone1.getImage();
        Image modifiedImage = image1.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        icone1=new ImageIcon(modifiedImage);
        pic1 = new JLabel(icone1);
        pic1.setSize(90,90);
        pic1.setLocation(10,30);
        c.add(pic1);
        
        String urll = "logo.png";
        ImageIcon icone2 = new ImageIcon(urll);
        Image image2 = icone2.getImage();
        Image modifiedImag = image1.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        icone2 = new ImageIcon(modifiedImag);
        pic2 = new JLabel(icone2);
        pic2.setSize(90,90);
        pic2.setLocation(390,30);
        c.add(pic2);
        
        title2 = new JLabel("Formulaire d'inscription"); 
        title2.setFont(new Font("verdana", Font.PLAIN, 25)); 
        title2.setSize(300, 30); 
        title2.setLocation(100, 150); 
        title2.setForeground(java.awt.Color.black);
        c.add(title2);
        
        JLabel condition = new JLabel("Tous les champs de ce formulaire sont obligatoires!");
        condition.setSize(300,20);
        condition.setLocation(30,200);
        condition.setForeground(Color.red);
        c.add(condition);
        
        name = new JLabel("Nom:"); 
        name.setFont(new Font("Arial", Font.PLAIN, 17)); 
        name.setSize(100, 20); 
        name.setLocation(30, 250); 
        c.add(name);
        
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(180, 250); 
        c.add(tname);
        
        surname = new JLabel("Prenom:"); 
        surname.setFont(new Font("Arial", Font.PLAIN, 17)); 
        surname.setSize(100, 20); 
        surname.setLocation(30, 300); 
        c.add(surname); 
  
        tsurname = new JTextField(); 
        tsurname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tsurname.setSize(190, 20); 
        tsurname.setLocation(180, 300); 
        c.add(tsurname);
        
        dob = new JLabel("Date de naissance: "); 
        dob.setFont(new Font("Arial", Font.PLAIN, 17)); 
        dob.setSize(200, 20); 
        dob.setLocation(30, 350); 
        c.add(dob); 
		
        day = new JComboBox(days); 
        day.setFont(new Font("Arial", Font.PLAIN, 15)); 
        day.setSize(60, 20); 
        day.setLocation(180, 350); 
        c.add(day);
        
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(240, 350); 
        c.add(month);
        
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(70, 20); 
        year.setLocation(300, 350); 
        c.add(year);
        
        sp = new JLabel("Spécialité: "); 
        sp.setFont(new Font("Arial", Font.PLAIN, 17)); 
        sp.setSize(100, 20); 
        sp.setLocation(30, 400); 
        c.add(sp); 
        
        tsp = new JComboBox(sps); 
        tsp.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tsp.setSize(190, 20); 
        tsp.setLocation(180, 400); 
        c.add(tsp);
        
        ys = new JLabel("Annee universitaire"); 
        ys.setFont(new Font("Arial", Font.PLAIN, 17)); 
        ys.setSize(200, 20); 
        ys.setLocation(30, 450); 
        c.add(ys); 
  
		tys = new JComboBox(yss); 
        tys.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tys.setSize(190, 20); 
        tys.setLocation(180, 450); 
        c.add(tys);
        
        pic5 = new JLabel();
        pic5.setSize(60,60);
        pic5.setLocation(250,10);
        
        JButton picBtn = new JButton("Ajouter une photo");
        picBtn.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent arg0){
        		JFileChooser file = new JFileChooser();
        		file.setCurrentDirectory(new File(System.getProperty("user.home")));
        		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        		file.addChoosableFileFilter(filter);
        		int result = file.showSaveDialog(null);
        		if(result == JFileChooser.APPROVE_OPTION) {
        			File selectedFile = file.getSelectedFile();
        			s = selectedFile.getAbsolutePath();
        		} else if(result == JFileChooser.CANCEL_OPTION) {
        			System.out.println("No File Select");
        		}
        	}
        });
        
        picBtn.setSize(200, 30);
        picBtn.setLocation(30, 600);
        c.add(picBtn);
        
        validate = new JButton("Valider");
        validate.setFont(new Font("Arial", Font.PLAIN, 15)); 
        validate.setSize(100, 30); 
        validate.setLocation(250, 600);
        validate.addActionListener(this);
        c.add(validate);
        
        all = new JTextArea();
        all.setFont(new Font("Arial", Font.PLAIN, 15)); 
        all.setSize(330, 230); 
        all.setLocation(500, 100); 
        all.setLineWrap(true); 
        all.setEditable(false);
        all.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.green));
        c.add(all);
        
        aname = new JLabel("Nom: "); 
        aname.setFont(new Font("Arial Black", Font.PLAIN, 10)); 
        aname.setSize(100, 20); 
        aname.setLocation(20, 120); 
        all.add(aname);
        nname = new JLabel();
        nname.setFont(new Font("Arial ", Font.PLAIN, 15)); 
        nname.setSize(100, 20); 
        nname.setLocation(55, 120); 
        all.add(nname);
        
        asurname = new JLabel("Prénom: "); 
        asurname.setFont(new Font("Arial Black", Font.PLAIN, 10)); 
        asurname.setSize(100, 20); 
        asurname.setLocation(150, 120); 
        all.add(asurname);
        ssurname = new JLabel();
        ssurname.setFont(new Font("Arial ", Font.PLAIN, 15)); 
        ssurname.setSize(100, 20); 
        ssurname.setLocation(200, 120);
        all.add(ssurname);
        
        adob = new JLabel("Date de naissance: "); 
        adob.setFont(new Font("Arial Black", Font.PLAIN, 10)); 
        adob.setSize(125, 20); 
        adob.setLocation(20, 140); 
        all.add(adob);
        ddob = new JLabel(); 
        ddob.setFont(new Font("Arial ", Font.PLAIN, 15)); 
        ddob.setSize(125, 20); 
        ddob.setLocation(150, 140); 
        all.add(ddob);
        
        asp = new JLabel("Spécialité: "); 
        asp.setFont(new Font("Arial Black", Font.PLAIN, 10)); 
        asp.setSize(100, 20); 
        asp.setLocation(20, 160); 
        all.add(asp);
        ssp = new JLabel(); 
        ssp.setFont(new Font("Arial ", Font.PLAIN, 15)); 
        ssp.setSize(100, 20); 
        ssp.setLocation(90, 160); 
        all.add(ssp);
        
        ays = new JLabel("Année universitaire:"); 
        ays.setFont(new Font("Arial Black", Font.PLAIN, 10)); 
        ays.setSize(130, 20); 
        ays.setLocation(20, 180); 
        all.add(ays);
        yys = new JLabel(); 
        yys.setFont(new Font("Arial ", Font.PLAIN, 15)); 
        yys.setSize(100, 20); 
        yys.setLocation(140, 180); 
        all.add(yys);
        
        ne = new JLabel("Numéro d'étudiant: "); 
        ne.setFont(new Font("Arial Black", Font.PLAIN, 10)); 
        ne.setSize(110, 20); 
        ne.setLocation(20, 200); 
        all.add(ne);
        nne = new JLabel(); 
        nne.setFont(new Font("Arial ", Font.PLAIN, 15)); 
        nne.setSize(100, 20); 
        nne.setLocation(130, 200); 
        all.add(nne);
        
        String urlll = "logo.png";
        ImageIcon icone3 = new ImageIcon(urlll);
        Image image3 = icone3.getImage();
        Image modifiedIma = image3.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        icone3 = new ImageIcon(modifiedIma);
        pic3 = new JLabel(icone2);
        pic3.setSize(90,90);
        pic3.setLocation(10,0);
        all.add(pic3);
        
        modify = new JButton("Créer une nouvelle carte");
        modify.setFont(new Font("Arial", Font.PLAIN, 15));
        modify.setSize(200, 20);
        modify.setLocation(500, 350);
        modify.addActionListener(this);
        c.add(modify);
        
        print = new JButton("Imprimer");
        print.addActionListener(new student1(all));
        print.setFont(new Font("Arial", Font.PLAIN, 15));
        print.setSize(100, 20);
        print.setLocation(750, 350);
        print.addActionListener(this);
        c.add(print);
        all.add(pic5);
        
        JButton saveBtn = new JButton("Enregistrer");
        saveBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BufferedImage bufferedImage = new BufferedImage(all.getWidth(), all.getHeight(), BufferedImage.TYPE_INT_RGB);
				Graphics graphic = bufferedImage.createGraphics();
				all.paint(graphic);
				
				try {
					ImageIO.write(bufferedImage, "png", new File("image.png"));
				} catch(Exception exception) {
					exception.printStackTrace();
				}
			}
        	
        });
        
        saveBtn.setSize(100, 20);
        saveBtn.setLocation(500, 400);
        c.add(saveBtn);
        
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent picBtn) {
		if (picBtn.getSource() == validate) {
			
			String data1 =  tname.getText(); String data2 = tsurname.getText();
			nname.setText(data1); ssurname.setText(data2);
			
			String data3 =  (String)day.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem() + "\n";
			ddob.setText(data3);
			
			String data5=(String)tsp.getSelectedItem();
            ssp.setText(data5);
            
            String data6=(String)tys.getSelectedItem();
            yys.setText(data6);
            
            Random rand = new Random();
            int nb;
            nb=rand.nextInt(10000000)+1;
            String data7 = String.valueOf(nb);
            nne.setText(data7);
            pic5.setIcon(ResizeImage(s));
            all.setEditable(false); 
		} else if (picBtn.getSource() == modify) {
			String def = "";
			nname.setText(def);
			tname.setText(def);

			ssurname.setText(def);
			tsurname.setText(def);

			all.setText(def);
			ddob.setText(def);
			ssp.setText(def);
			yys.setText(def);
			nne.setText(def);
			
			day.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0);
            tsp.setSelectedIndex(0);
            tys.setSelectedIndex(0);
            pic5.setIcon(ResizeImage(def));
		}
	}
	
	private Icon ResizeImage(String ImagePath) {
		// TODO Auto-generated method stub
		ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(pic5.getWidth(),pic5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card exm = new Card();
	}

}
