package gestionegraficaconawt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AscoltatoreBtn implements MouseListener{
        static Button b1, b2, b3, b4, b5, b6, b7, b9, b10;
	static TextField txt;
        static int i=0, n;
        public static int[] array=new int[8];
	@Override
	public void mouseClicked(MouseEvent e) {
                String a=e.getSource().toString();
                String comando="";
                for(int i=0; i<a.length(); i++){
                    if(a.charAt(i)=='='){
                        i++;
                        while(a.charAt(i)!=']'){
                            comando=comando+a.charAt(i);
                            i++;
                        }
                        break;
                    }
                }
                int j;
                switch(comando){
                    case "<<":
			System.out.println("Premuto bottone "+comando);
                        i=0;
			break;
                    case ">>":
			System.out.println("Premuto bottone "+comando);
                        i=array.length-1;
                        break;
                    case "<":
			System.out.println("Premuto bottone "+comando);
                        if(i!=0)
                            i--;
                        b3.setBackground(Color.green);
                        b6.setBackground(Color.green);
			break;
                    case ">":
			System.out.println("Premuto bottone "+comando);
                        if(i!=array.length-1)
                            i++;
                        b1.setBackground(Color.green);
                        b4.setBackground(Color.green);
			break;
                    case "ADD":
                        System.out.println("Premuto bottone "+comando);
			n=Integer.parseInt(txt.getText());
                        int[] nuovo1=new int[array.length+1];
                        for(j=0; j<array.length; j++){
                            nuovo1[j]=array[j];
                        }
                        nuovo1[j]=n;
                        array=nuovo1;
			i=array.length-1;
			break;
                    case "DEL":
			System.out.println("Premuto bottone "+comando);
                        i=array.length-1;
                        int[] nuovo2=new int[array.length-1];
                        for(j=0; j<array.length-1; j++){
                            nuovo2[j]=array[j];
                        }
                        array=nuovo2;
                        i--;
			break;
                    case "INS":
                        System.out.println("Premuto bottone "+comando);
                        n=Integer.parseInt(txt.getText());
                        int[] nuovo3=new int[array.length+1];
                        for(j=0; j<i; j++){
                            nuovo3[j]=array[j];
                        }
                        nuovo3[j]=n;
                        j++;
                        int k=j-1;
                        while(k<array.length){
                            nuovo3[j]=array[k];
                            j++;
                            k++;
                        }
                        array=nuovo3;
			break;
                }
                b2.setLabel("Lung= "+String.valueOf(array.length));
                b5.setLabel("Elemento corrente= "+String.valueOf(array[i]));
                if(i==0){
                    b1.setBackground(Color.red);
                    b4.setBackground(Color.red);
                    b3.setBackground(Color.green);
                    b6.setBackground(Color.green);
                }
                if(i==array.length-1){
                    b3.setBackground(Color.red);
                    b6.setBackground(Color.red);
                    b1.setBackground(Color.green);
                    b4.setBackground(Color.green);
                }
                    
        }

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
        
        public static void load(String fileName) throws FileNotFoundException{
            File inputFile=new File(fileName);
            Scanner input=new Scanner(inputFile);
            int k=0;
		while(input.hasNext()){
                int n=input.nextInt();
                array[k]=n;
                k++;
            }
            input.close();
        }
		
	public static void creazioneLayout(){
		Frame f = new Frame("Bottone con ascoltatore");
		f.setSize(400, 400);
		
		b1 = new Button("<<");
		b2 = new Button("Lung= "+String.valueOf(array.length));
		b3 = new Button(">>");
		b4 = new Button("<");
		b5 = new Button("Elemento corrente= "+String.valueOf(array[i]));
		b6 = new Button(">");
		b7 = new Button("ADD");
		txt = new TextField("");
		b9 = new Button("DEL");
                b10 = new Button("INS");
		b1.setBackground(Color.red);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.green);
		b4.setBackground(Color.red);
		b5.setBackground(Color.white);
		b6.setBackground(Color.green);
		b7.setBackground(Color.green);
		txt.setBackground(Color.white);
		b9.setBackground(Color.green);
                b10.setBackground(Color.green);
                
		AscoltatoreBtn btn = new AscoltatoreBtn();
		b1.addMouseListener(btn);
		b2.addMouseListener(btn);
		b3.addMouseListener(btn);
		b4.addMouseListener(btn);
		b5.addMouseListener(btn);
		b6.addMouseListener(btn);
		b7.addMouseListener(btn);
		txt.addMouseListener(btn);
		b9.addMouseListener(btn);
                b10.addMouseListener(btn);
		
		AscoltatoreWin win = new AscoltatoreWin();
		f.addWindowListener(win);
		
//		f.setLayout(null);
//		f.setLayout(new BorderLayout());
		f.setLayout(new GridLayout(4,3));
	
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(txt);
		f.add(b9);
                f.add(b10);
		f.setVisible(true);
	}
}
