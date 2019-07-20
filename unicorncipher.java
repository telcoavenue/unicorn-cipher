

/*

###############################################################################

unicorn cipher version 1.00

CEATED BY <tinoC23/> @ 07/2019

###############################################################################

The Caesar cipher is named after Julius Caesar, who used it with a shift of three to protect messages of military significance. 

If he had anything confidential to say, he wrote it in cipher, that is, by so changing the order of the letters of the alphabet, that not a word could be made out. 

If anyone wishes to decipher these, and get at their meaning, he must substitute the fourth letter of the alphabet, namely D, for A, and so with the others.

###############################################################################

  CEASAR CIPHER FLOW
 +++++++++++++++++++
 
 [1] user exeutes the program
 [2] user enters a text in order to be ciphered or user may need to reset the message before the user press the 'cipher' button
 [3] user press the cipher button 
[4] program stores the total number of text lines in an integer
 [5] program store the text to be executed in a string array. Each line of text, is separated/stored in a different array cell
 [6] loop execution initiated
 [7] program goes in each line of the stored text and tokenize the each line words. program stores the total number of words/ lines in an [int] array.
 [8] loop execution terminated
 [9] program initite values to a 2D [string] array. 
        the 2D array values are String [name] [][]= new String [number of text lines][];
	 In a loop, program initiate the word values to the 2D array, as : [name] = new String [number of text lines][number of words per line];
	 create an identical 2d [string] array[][], with the same name space as the primary 2d string array.
[10] loop starts. 
        loop stracture : 
	outer loop turns : 0 to 2D [string] array length - 1
	inner loop 1 turns : 0 to 2D [string] array [][number of words per line]-1
	inner loop 2 turns : 0 to 1D [char] array length-1
	inner loop 3 turns : 0 to 1D [char] array length-1
[11] access each 2D [string] array line
[12] access each word of the 2D [string] array lines
[13] inner loop start
[14] tokenize each line word into characters
[15] count total word characters and parse the number as the length of a 1D [char] array
[16] inner loop end
[17] inner loop 2 start
[18] tokenize each line word into characters. store each line character in the [char] array
[19] inner loop 2 end
[20] inner loop 3 start
[21] cipher each 1d [char] array characters, combine them together, form the ciphered word and store it on the appropriate location of the alternate 2d [string] array
[22] inner loop 3 end
[23] store the alternate 2d [string] array contents(the cipher message) in a text file on computer hard drive 

[error exception handling] -> symbols other than latin alfabet(special symbols, other alfabets than latin one), are not processed by the cipher algoritm 
									 -> numbers, are not processed by the cipher algoritm 

###############################################################################



PROGRAM FLOW THROUGH ARRAYS ::::: 

[1] int linesNumber=0;

[2]  String [] textLinesCarrier=new String[linesNumber];

[3] store text lines to String [] textLinesCarrier <-- for loop 
      
[4] int lineTotalWords=0; --> find after each text line tokkenization 

[5] int [] spacePerLine=new int[linesNumber] <-- each array cell, will include lineTotalWords for error correction ....

[6] String [][] textModules[linesNumber][spacePerLine[i]] --> dynamic array .... 

[7] create an identical array of : String [][] textModules[linesNumber][spacePerLine[i]] --> String [][] textModulesTwinArray[linesNumber][spacePerLine[i]]

	initiate a characters array -> char [] charCarrier=new char[]; 
	
										-> int charNUM=0;
	
										-> char [] charCarrierTwin=new char[];
										
										-> string prseWORD="";

[8] words taken from the String [][] textModules[linesNumber][spacePerLine[i]]  :::

		a) init for loop :  turns -> 0 to linesNumber -> for(int i=0; i<linesNumber ; i++)
		
			b) inner loop of init loop : turns -> for(int y=0; i<textModules[i][pacePerLine[i]].length ; i++) ::: executes text line . Gives the words of each line to it inner for loop
			
				c1) words tokenizer  -> gives the total number of characters in a word through : int charNUM
				
				c2) result is charCarrier=new char[charNUM] ->  charCarrierTwin=new char[charNUM]
				
				c3) words tokenizer -> parse the word characters to char charCarrier[] ;
				
						d1) for loop inside the inner loop -> runs 0 to  charCarrier[].length times ::: for(int z=0; z<charCarrier.length ; z++)
						
									@ cipher each word character with a shift of three patern
									
									@ [error exception handling] -> symbols other than latin alfabet(special symbols, other alfabets than latin one), are not processed by the cipher algoritm 
																		-> numbers, are not processed by the cipher algoritm 
																		
									@ each ciphered word is passed to the  charCarrierTwin[] CHAR ARRAY .....
									
									@ at the charCarrier.length-1 for loop turn 
											
											# the final outcome of the charCarrierTwin[] CHAR ARRAY is converted to a single string/word
								
											# the single string/word is passed to the String [][] textModulesTwinArray[i][spacePerLine[i]]
								
[9] after process [8] completed, the whole data of the String [][] textModulesTwinArray[i][spacePerLine[i]] string array will be exported to a text file, that will contain the ciphered text
	 on a directory of the user terminal. 
								
			
This is the whole process of the ::: shift of three Caesar cipher program ...... ;-) ....... enjoy 




@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

 :::: helping code chunks ::::
 
 [1] Java: Simple way to convert String to Char Array 
				--> it takes as input a line of text(a string) and 
					 outputs a dynamically created char array with the inputed line of text(including the spaces between words),
					 tokenized as a seperate char in the array cells .... 

	url :	https://crunchify.com/java-simple-way-to-convert-string-to-char-array/

package com.crunchify;
 
public class CrunchifyStringToCharArray {
 
	public static void main(String[] args) {
		String testString = "This Is Test";
		char[] stringToCharArray = testString.toCharArray();
 
		for (char output : stringToCharArray) {
			System.out.println(output);
		}
	}
}


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


FILE JUNK CODE .....

///////////////////////////////////////////////////////////////////////////////////////////////
			
[1]
            
		JLabel saveTHEcontent=new JLabel("set a new path(folder/directory) ....");
	  saveTHEcontent.setBackground(Color.WHITE);
	   saveTHEcontent.setForeground(Color.BLACK);
	 saveTHEcontent.setEnabled(true);
    saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =saveTHEcontent.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           saveTHEcontent.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          saveTHEcontent.setForeground(oldcolor);
         }
      }
      );
	saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		
		//
		
		String fN = JOptionPane.showInputDialog(null, "Please enter your preferred folder/directory/path name : ");
		
		//
		
		FILEname=fN;
		
		//
		
		currentPATHdirectory.setText("current directory path is : "+FILEname);
		
		//
		
		 		
        }
		
      }
      );
       options.add(new JSeparator());//add a seperator line
	 options.add(saveTHEcontent);	
       options.add(new JSeparator());//add a seperator line


///////////////////////////////////////////////////////////////////////////////////////////////

[2]



		//


		public String [] menu=new String[]{"Date"};


	//
	
	public int one = 1 ;
	
	
	//
	
	public JLabel [] fnLabel=new JLabel[one];
		
		//
		
	public JTextField [] fnTF=new JTextField[one];


	  //
	  
	for(int i=0;i<fnLabel.length;i++)
	{
	  
	for(int j=0;j<fnTF.length;j++)
	{
			  
		if(i==0)
		{
				  
			// 
			  
	   fnLabel[i]=new JLabel(menu[i]);
	 fnLabel[i].setHorizontalAlignment(JLabel.CENTER);
	   fnLabel[i].setBackground(Color.WHITE);
	   fnLabel[i].setForeground(Color.BLACK);			
		 fnLabel[i].setFont(f);
		createFILE.add(fnLabel[i]);		  
				  
				//
			
		 fnTF[i]=new JTextField("",45);
	  fnTF[i].setBackground(Color.WHITE);
	  fnTF[i].setForeground(Color.BLACK);			
		fnTF[i].setFont(f);
		createFILE.add(fnTF[i]);
			
		 //     
			  
		}
	  
	}
		
	}


///////////////////////////////////////////////////////////////////////////////////////////////


[3] https://stackoverflow.com/questions/10253409/how-to-read-line-by-line-from-a-text-area

		What you get from TextArea is just a String. Split it at newline and you've got your String[].

for (String line : textArea.getText().split("\\n")) doStuffWithLine(line);


[or]



[4]

				
				
				for (String line : TA.getText().split("\\n"))
				{
					
					out.newLine(); 
					
					out.write(line);
					
				}
				
	


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



[5] https://www.techiedelight.com/convert-char-array-string-java/



// Convert char array to String in Java
class Util
{
	public static void main(String[] args)
	{
		char[] chars = {'T', 'e', 'c', 'h', 'i', 'e', ' ', 
						'D', 'e', 'l', 'i', 'g', 'h', 't'};

		String string = new String(chars);
		System.out.println(string);
	}
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




  get jtextarea text -> tokenize text line by line -> convert each line from string line to char line -> cipher each char separaterly 
  
-> error handling mechanism -> convert char array to string -> store the cipher  string to an array string -> loop the process ->

store final string array to memory ..... 





///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public int lines = 0 ; // --> j text area lines number 


public String [] JTextAreaCarrier = new String[lines];


public char[] StringToCharCarrier = new char [lines]; 



	public String [] LatinUpperCase=new String[]{"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};  --> cipher text array one
	
	
	
	public String [] LatinLowerCase=new String[]{"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};  --> cipher text array two




//




https://stackoverflow.com/questions/3120922/joptionpane-input-to-int


int ans = Integer.parseInt( JOptionPane.showInputDialog(frame,
        "Text",
        JOptionPane.INFORMATION_MESSAGE,
        null,
        null,
        "[sample text to help input]"));
		


//



https://codippa.com/how-to-generate-a-random-number-with-in-a-range-in-java/





import java.util.Random;
 
public class RandomNumberGenerator {
 
	public static void main(String[] args) {
		usingRandomClass();
	}
	static void usingRandomClass() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(50) + 1;
		System.out.println("Random number generated is : " + randomInt);
	}
}







*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Random;

import java.text.Format;

import java.util.Formatter;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Calendar;

import java.util.Date;

import java.time.LocalDate;

import java.io.FileWriter;

import java.io.BufferedWriter;

import java.util.*;

import java.util.List;

import java.util.LinkedList;

import java.util.Scanner;

import java.io.*;

import java.util.MissingResourceException;

import javax.swing.JScrollBar;

import javax.swing.JTextArea;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit;

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

import java.awt.KeyEventDispatcher;

import java.awt.KeyboardFocusManager;

import java.awt.event.KeyEvent;

import java.lang.Object;

import java.awt.Robot;

import java.lang.ArrayIndexOutOfBoundsException;

 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;
 
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.util.*;

import javax.swing.JScrollPane;

import javax.swing.JComboBox;

import java.util.Arrays;

import javax.swing.JCheckBox;

 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.*;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;

import java.lang.Object;

import java.util.StringTokenizer;

import java.lang.Math;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.*;

import java.util.MissingResourceException;

//

public class unicorncipher extends JFrame
{
	
	
	//
	
				
		
	public   String info=" ";
	
	
	//
		
		public String x=" ";
	
	
	
	//
	
	
	
		
		public String keyString=" ";
	
	

	
	
	//
	
	
	public JTextArea TA;
	
	
	
	
	//
	
	
	public  JLabel currentPATHdirectory;
	
	
	//
	
	public String FILEname="C:/cipher.text/";
	
	//
	
	public  Font f = new Font("Serif", Font.BOLD, 14);
	
	//
	
	
	
	public int lines = 0 ; 		// --> j text area lines number 
	
	
	
	//


public String [] JTextAreaCarrier = new String[lines];


//


public char[] StringToCharCarrier; 


//


public String [] JTextAreaCarrierTwin = new String[lines];


//


public char[] StringToCharCarrierTwin; 


//


/*



ISO basic Latin alphabet


Uppercase Latin alphabet	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z


Lowercase Latin alphabet	a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z



///



String [] turnsCIPHERpattern={"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};



/////



*/


//




String [] turnsCIPHERpattern={"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};




//


	
	
	public String [] LatinUpperCase=new String[]{	"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	//
	
	public String [] LatinLowerCase=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		
        //
	
	
	
	public unicorncipher() // constractor class 
	{
		
		
		
		//
		
		// if not exist, create the directory C:/cipher.text/2019/  on the user system ..... 
		
	String [] dirMAP={"C:/cipher.text/","C:/cipher.text/2019/"};
		

	File file1;
	
	
	try
	{
	for(int s=0;s<dirMAP.length;s++)	
	 {
	file1 = new File(dirMAP[s]);
	try{
	if (!file1.exists())
	{
	file1.mkdir();
	}}
	catch(SecurityException se1)
	{
        se1.printStackTrace();
         }        
         }
       }
     catch(SecurityException  se)
        {
	se.printStackTrace();
        }
		
		
		//
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); 
		
		JPanel currentDIRECTORY=new JPanel(); 
		
		
		JPanel createFILE=new JPanel(); 
	
			JPanel jtextareaheader = new JPanel(); 
		
		JPanel currentDIRECTORYjTextArea = new JPanel(); 
		
			JPanel fireJButton = new JPanel(); 
		
		//
		
		JPanel box=new JPanel(); // carries all the jpanels
	
	//
	
					header.setLayout(new FlowLayout(FlowLayout.LEFT));    // jmenubar
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			currentDIRECTORY.setLayout(new FlowLayout(FlowLayout.CENTER));    // directory Layout
			currentDIRECTORY.setBackground(Color.GRAY); 
			currentDIRECTORY.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			createFILE.setLayout(new GridLayout(1,2,5,5)); // JLabel and JTextField Layout
		createFILE.setBackground(Color.CYAN);
		createFILE.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		
		
			jtextareaheader.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea header ..... 
			jtextareaheader.setBackground(Color.GRAY); 
			jtextareaheader.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		
			currentDIRECTORYjTextArea.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea Layout
			currentDIRECTORYjTextArea.setBackground(Color.GRAY); 
			currentDIRECTORYjTextArea.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
					fireJButton.setLayout(new FlowLayout(FlowLayout.CENTER));    // footer layout
			fireJButton.setBackground(Color.GRAY); 
			fireJButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			//
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  // add all layouts in one main layout ..... 
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			//
			
			
			  JMenuBar KBMenuBar = new JMenuBar();
			
			      JMenu  options = new JMenu("MENU");
		options.setForeground(Color.BLACK);
		options.setBackground(Color.WHITE);
		
		
			JMenu ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(options);
		 KBMenuBar.add(ABOUT);
		
		
			
			
			

	  

			//
	  
					
	JLabel EXIT=new JLabel("EXIT PROGRAM");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	JOptionPane.showMessageDialog(null," \n Press the OK button, \n in order for the program to be terminated ...... \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 options.add(EXIT);	
	options.add(new JSeparator());//add a seperator line
      
	  
	  //
	  
	  
	  
	    
      
      		JLabel programAuthor=new JLabel("author");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n program created by: \n <tinoC23/> \n @ 07/2019 \n email : c.constantinou.24@gmail.com \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
	  ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
				
				 //
	  
	  
	    
      
      		JLabel programVsion=new JLabel("about ");
	  programVsion.setBackground(Color.WHITE);
	  programVsion.setForeground(Color.BLACK);
	 programVsion.setEnabled(true);
   programVsion.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programVsion.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programVsion.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programVsion.setForeground(oldcolor);
         }
      }
      );
	programVsion.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n unicorn cipher - version 1.00 - \n 07/2019 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programVsion);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
	  
	  //
	  
	  
	  	JLabel technologyUSED=new JLabel("technologies used");
	  technologyUSED.setBackground(Color.WHITE);
	  technologyUSED.setForeground(Color.BLACK);
	 technologyUSED.setEnabled(true);
   technologyUSED.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =technologyUSED.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           technologyUSED.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         technologyUSED.setForeground(oldcolor);
         }
      }
      );
	technologyUSED.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Program created by using the following technologies : \n 1) Java JDK version 8 \n 2) SciTE text editor version 4 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(technologyUSED);
	  ABOUT.add(new JSeparator());//add a seperator line
	  
	  
	  //
	  
	  
	  header.add(KBMenuBar);	
	  
	  
	  //
	  
	  
	  
	  
	   currentPATHdirectory=new JLabel("current directory path is : "+FILEname);
	  currentPATHdirectory.setBackground(Color.WHITE);
	  currentPATHdirectory.setForeground(Color.GREEN);			
		currentPATHdirectory.setFont(f);
      currentDIRECTORY.add(currentPATHdirectory);
	  
	  
	  
	  


		
				
		
	      // 
		
		
		
		
			TA=new JTextArea(" ");
			TA.setEditable(true);
                     TA.setBounds(5,5,650,350);
			  TA.setMaximumSize(getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
        TA.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            TA.setLineWrap(true);
               TA.setWrapStyleWord(false);
	       TA.setCaretPosition(TA.getDocument().getLength());
		TA.setFont(new Font("Serif",Font.PLAIN,12));
		TA.addKeyListener(new KeyListener()
			 {
				 
				 
				 //			 
				 
    public void keyReleased(KeyEvent e)
        {
	    
			try
			{
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        } 
	}
	catch(StringIndexOutOfBoundsException cvp)
	{
		
		cvp.printStackTrace();
		
	}
	    
	}
    
    //
    
    public void keyPressed(KeyEvent e)
	{
		
		
      int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
			
	char c = e.getKeyChar();
			
	keyString=String.valueOf(c);
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).toString();
	
	TA.setText(x);
		 
        } 		
		
	try
	{
		
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        }
	
        }
	catch(StringIndexOutOfBoundsException StringIndexOutOfBoundsException)
	{
		
		StringIndexOutOfBoundsException.printStackTrace();
		
	}
		
	}
    
    //
	    
	                    
			
	public void keyTyped(KeyEvent e) 
	{
			
	}
	
	
			
		//
	    
		
				 
			 });
			 
			 
	JScrollPane scrollPane = new JScrollPane(TA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		 scrollPane.setPreferredSize(new Dimension(650, 350));
		scrollPane.setBounds(5, 5, 650, 350);
                scrollPane.setBorder(BorderFactory.createTitledBorder("Enter the text to be ciphered here ..... "));
		scrollPane.setViewportView(TA);			 


                    jtextareaheader.add(scrollPane);	
			 
		
			  //
	  
	  
	         JButton reset=new JButton("Reset Fields");
	reset.setBackground(Color.WHITE);
	reset.setForeground(Color.BLACK);			
	reset.setFont(f);
	reset.setEnabled(true);
	reset.setToolTipText("reset button");
	reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				
	//
	// reset components :::
	//
	// reset string [] carrier
	// reset char [] carrier 
	// reset jtextarea 
	//
				
				TA.setText("");
			
		// reset components 
				
				
				
			}
		});
      
      
      fireJButton.add(reset);
	  
	  
	  //
	  
	  JButton createFile=new JButton("cipher text");
	createFile.setBackground(Color.WHITE);
	createFile.setForeground(Color.BLACK);			
	createFile.setFont(f);
	createFile.setToolTipText("");
	createFile.setEnabled(true);
	  createFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				
				
				
				// unicorn cipher encryption engine .....
		
				
				
				
             Date date = new Date();
	
	
	Format formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
				
				
				// algorithm/cipher total repetitions .... 
				
				
				int reps = 0;
				
			
			while(reps<1 || reps>25)
			{
				String m = JOptionPane.showInputDialog("please enter a number between 1 to 25 !!!");
				System.out.println(m+" "+reps);
				reps = Integer.valueOf(m);
				if(reps<1 && reps>25)
				{
					JOptionPane.showMessageDialog(null,
					"you have entered a number less than 1 , \n or grater than 25 . \n please enter a correct value !!!! \n\n\n ",
	"ERROR MESSAGE",JOptionPane.INFORMATION_MESSAGE);
				}
			}
				
				
				
				String [] cipherPATERN= new String[reps];
				
				
				
				Random randomGenerator = new Random();
				
				
					int randomInt=0;
					
				
		//	int randomInt = randomGenerator.nextInt(25) + 1;
				
				
				lines = 0 ; 
				
				
				for (String line : TA.getText().split("\\n"))
				{
					
				lines++;
					
				}
				
				
				
				
				
				
	         	JTextAreaCarrier = new String[lines];
				
				
				
				
				JTextAreaCarrierTwin = new String[lines];
				
			
				
				String [] rectifier = new String[lines];
				
				
				
				
				int steps=0;
				
				for (String line : TA.getText().split("\\n"))
				{
					
				JTextAreaCarrier[steps]=line;
					
					
					JTextAreaCarrierTwin[steps]="";
					
					
					
					rectifier[steps]="";
					
					
				steps++;
					
				}
				
				
				
					
		//
		
		
		
		
		
		String sometext2=FILEname+".non.ciphered.text."+(formatter.format(date))+".txt";
				

				
				File file2 = new File(sometext2);
								
			
				System.out.println(file2);
			


	try
	{
	  if (!file2.exists()) 
	{
	     file2.createNewFile();
	  }
        }
     catch(IOException expn2)
        {
            
             expn2.printStackTrace();
		
        }
	
		
		
		
	
		
		//
		
		
		BufferedWriter out;
		
		
		//
		
		
	
	try 
	{
		
		
	
		
	 out = new BufferedWriter(new FileWriter(file2));
		    
		
		
	
			for(int f2=0;f2<JTextAreaCarrier.length;f2++)		
			{		
				
				
				
				out.write(JTextAreaCarrier[f2]);
				
				
				
				out.newLine(); 
				
				
			}
	
			
	    
				out.close();
		
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
		
		
		
		
		
		//
				
				
				
					System.out.println("\n total jtextarea lines are : "+lines+
				"\n JTextAreaCarrier length is :"+JTextAreaCarrier.length+
				"\n");
				
				
				
				
				
				
				for(int i=0;i<JTextAreaCarrier.length;i++)
				{
					
					
					System.out.println(JTextAreaCarrier[i]);
					
					
				}
				
				
				
				
				// cipher operation initiated ..... 
				
				
				
		for(int p=0;p<reps;p++)
		{			
				
			
			System.out.println("\n\n p is "+p);
			
			
			
					randomInt = randomGenerator.nextInt(25) + 1;
				
				
					
				System.out.println(randomInt);
			
			
			
						
					cipherPATERN[p]=turnsCIPHERpattern[randomInt-1];
					
					
					
					
					System.out.println(cipherPATERN[p]);
			
			
			
			
				
				
				for(int i=0;i<JTextAreaCarrier.length;i++)
				{
					
					
					
					
						System.out.println("\n\n i is "+i);
					
					if(p==0)
					{
					
						
					StringToCharCarrier = JTextAreaCarrier[i].toCharArray();

					
					
					
					StringToCharCarrierTwin = new char[StringToCharCarrier.length];
						
						
					
					}
					else if(p>0)
					{
						
						
						for(int ll1=0;ll1<StringToCharCarrier.length;ll1++)
						{
							
							
						//	StringToCharCarrier[ll1]=' ';
							
							
						}
						

					StringToCharCarrier = rectifier[i].toCharArray();

					
					
					StringToCharCarrierTwin = new char[StringToCharCarrier.length];
						
						
						
						for(int ll=0;ll<StringToCharCarrierTwin.length;ll++)
						{
							
							
						//	StringToCharCarrierTwin[ll]=' ';
							
							
						}
						
						
						
					}
					
					
					System.out.println("\n"+StringToCharCarrier.length+" , "+StringToCharCarrierTwin.length+"\n");
					
					
					
					
					
					
				
					
					
						for(int j=0;j<StringToCharCarrier.length;j++)
						{
					
					
							System.out.println(" \n\n j is "+j);

							// null carrier ..... 
							
							
							
							
									for(int k=0;k<LatinUpperCase.length;k++)
									{
					
										System.out.println(" k is "+k);
					
										/*
										
										
										for reference only ..... 
										
										public String [] LatinUpperCase=new String[]{	"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
										public String [] LatinLowerCase=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
										
										
										
										*/
										
										
										
										
									//	char c1=LatinUpperCase[k].charAt(0);  .... not count ....
										
										
										
										
									//	char c2=LatinLowerCase[k].charAt(0);  .... not count ....
										
										
										
										
										
										
										if(LatinUpperCase[k].charAt(0) == StringToCharCarrier[j])
										{
											
											
											int ak=0; ak=k+randomInt;
											
											if(ak>=LatinUpperCase.length)
											{
												
												
												
												ak=ak-LatinUpperCase.length;
												
												
												
											}
												
												/*
												
												why   ak=ak-25-1   ? 
												
												let assume ak=28;
												
												that means k=25. that means the letter to be ciphered is the letter Z
												- letter Z is the 26th letter in the latin alphabet, thus the object carried in the cell 25 of the array
												- an array cell begins with the number 0 and goes through the Nth number
												- in our case, the latin alphabet is carried in a string array of 26 places, which provide the cells 0 to 25 for the letters storage
												
												
												The letter Z cipher representation, is the letter C, the letter occupied the cell with number 2.
												thus 28-25=3
												thus 3-1=2
												thus the array cell that carries the correct letter, is the cell number 2.
												
												
												
												*/
												
												
												
												
											
											System.out.println("ak:"+ak);
											
											
											
										
											StringToCharCarrierTwin[j]=LatinUpperCase[ak].charAt(0);
										
											
											
											
											
											k=LatinUpperCase.length;
											
											
										}
										else if(LatinLowerCase[k].charAt(0) == StringToCharCarrier[j])
										{
											
											
												int bk=0; bk=k+randomInt;
											
											
											if(bk>=LatinUpperCase.length)
											{
												
												
												bk=bk-LatinUpperCase.length;
												
												
											}
											
											
											
											System.out.println("bk:"+bk);
											
											
											
											StringToCharCarrierTwin[j]=LatinLowerCase[bk].charAt(0);
											
											
												k=LatinUpperCase.length;
											
											
											
										}
 										else if( ( k == ( LatinUpperCase.length-1 ) ) && ( LatinUpperCase[k].charAt(0) != StringToCharCarrier[j] )  && ( LatinLowerCase[k].charAt(0) != StringToCharCarrier[j] )    )
										{
											
										
											
											
											
											StringToCharCarrierTwin[j]=StringToCharCarrier[j];
										
											
											
											
										}
										
										
										
										
										
					
					
									}
							
							
					
					
						}
						
						
						
						// test area ...
						
						rectifier[i] = new String(StringToCharCarrierTwin);
						
						System.out.println(rectifier[i]);
						
						// test area ...
						
						
						
						if(p==(reps-1))
						{
						
						JTextAreaCarrierTwin[i] = new String(StringToCharCarrierTwin);
						
						}
						
					
					
				}
				
				
				
		
		}				
				
				
				/////////////////
				
				
				
				
				
				
				/*
				
				
				-> storage file reminder ..... 
				
				public String FILEname="C:/cipher.text/";   
				
				
				
			package com.mkyong;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDateTime {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

    }

}


Output

2016/11/16 12:08:43
2016/11/16 12:08:43
2016/11/16 12:08:43
2016/11/16
				
				
				
				
				*/
				
								

	
	
	
	//
				
				
				String sometext=FILEname+"unicorn.forward.cipher."+(formatter.format(date))+".txt";
				

				
				File file = new File(sometext);
								
			
				System.out.println(file);
			


	try
	{
	  if (!file.exists()) 
	{
	     file.createNewFile();
	  }
        }
     catch(IOException expn1)
        {
            
             expn1.printStackTrace();
		
        }
	
		
		
		//
		
		
		
		
		
		
		
		
		
		String sometext1=FILEname+"unicorn.forward.cipher.private.key."+(formatter.format(date))+".txt";
				

				
				File file1 = new File(sometext1);
								
			
				System.out.println(file1);
			


	try
	{
	  if (!file.exists()) 
	{
	     file1.createNewFile();
	  }
        }
     catch(IOException expn1)
        {
            
             expn1.printStackTrace();
		
        }
	
		
		
		
	
		
		//
		
		
	
	try 
	{
		
		
	
		
	 out = new BufferedWriter(new FileWriter(file1));
		    
		
		
	
			for(int f1=0;f1<cipherPATERN.length;f1++)		
			{		
				
				
				
				out.write(cipherPATERN[f1]);
				
				
				
			//	out.newLine(); 
				
				
			}
	
			
	    
				out.close();
		
	    
        }
        catch (IOException expn2)
        {
            
             expn2.printStackTrace();
		
        }
		
		
		
		
		
		//
		
		
		
		
		
		
		try 
	{
		
		
	
		
	 out = new BufferedWriter(new FileWriter(file));
		    
		
		
	
			for(int f=0;f<JTextAreaCarrierTwin.length;f++)		
			{		
				
				
				
				out.write(JTextAreaCarrierTwin[f]);
				
				
				
				out.newLine(); 
				
				
			}
	
			
	    
				out.close();
		
	    
        }
        catch (IOException expn1)
        {
            
             expn1.printStackTrace();
		
        }
		
		
		
		
		
		
		
		
	//

		
	//
	// reset components :::
	// reset string [] carrier
	// reset char [] carrier 
	// reset jtextarea 
	//
				
				
				TA.setText("");
			
		// reset components 
				
				
		}});		
		
		
		fireJButton.add(createFile);
		
		
		
		
		
		//
	  
		
		
		box.add(header);
		   box.add(currentDIRECTORY);
		   box.add(createFILE);
		box.add(jtextareaheader);
		box.add(currentDIRECTORYjTextArea);
		     box.add(fireJButton);
		     
		     //
		
		JFrame frame=new JFrame(" unicorn cipher - version 1.00 - ");
		frame.add(box);
		
		// 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
		
		
	}
	
	//
	// splash screen ..... 
	
	static void splashSCREEN()
	{
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
double width = screenSize.getWidth();
double height = screenSize.getHeight();
		
		int w=(int)width;
		
			int h=(int)height;
		
		JWindow window = new JWindow();

 ImageIcon image = new ImageIcon("unicorn.logo.png");	
JLabel jl= new JLabel(image);
jl.setText("UNICORN CIPHER");
jl.setHorizontalTextPosition(JLabel.CENTER);
jl.setVerticalTextPosition(JLabel.BOTTOM);		
jl.setForeground(Color.BLACK);
		
window.add(jl);				
		
window.setBounds( h/2, w/4 , 230, 240);
		
window.setVisible(true);
		
try 
{
Thread.sleep(5000);
} 
catch (InterruptedException e) 
{
    e.printStackTrace();
}

window.setVisible(false);

window.dispose();
		
	}
	
	// 

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String [] unicorncipher)
	{
		
		

		
	//		JOptionPane.showMessageDialog(null," \n Three Step Ceasar cipher V1.00 \n\n Brief description : \n Three Step Ceasar Cipher \n ciphers a plain text message \n ex. A will become D if ciphered \n by using a Three Step Ceasar Cipher \n\n\n Enjoy !!! \n\n\n ;-) \n ",
	//		"INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		
		
		
		
		
		splashSCREEN();
		
		
		
		
		
		new unicorncipher();
		
		
		
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
}




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





