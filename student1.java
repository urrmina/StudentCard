package ihmProjet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JTextArea;

public class student1 extends JTextArea implements Printable, ActionListener{
	
	JTextArea frameToPrint;
	
	public int print1(Graphics g, PageFormat pf, int page) throws PrinterException{
		if(page > 0) {
			return NO_SUCH_PAGE;
		} else {
			Graphics2D g2d = (Graphics2D) g;
			g2d.translate(pf.getImageableX(), pf.getImageableY());
			frameToPrint.printAll(g);
			return PAGE_EXISTS;
		}
	}
	
	public void ActionPerformed(ActionEvent e) {
		PrinterJob job = PrinterJob.getPrinterJob();
		job.setPrintable(this);
		boolean ok = job.printDialog();
		if(ok) {
			try {
				job.print();
			} catch (PrinterException ex) {
				
			}
		}
	}
	
	public student1(JTextArea f){
		frameToPrint = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int print(Graphics arg0, PageFormat arg1, int arg2) throws PrinterException{
		return 0;
	}

}
