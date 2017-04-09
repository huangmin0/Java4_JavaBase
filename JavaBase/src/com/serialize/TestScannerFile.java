package com.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.midi.MidiDevice.Info;

public class TestScannerFile {


	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("C:/myInfo.info");
		Scanner in =new Scanner(file);
		String info=null;
		while (in.hasNextLine()) {
			info = in.nextLine();
			System.out.println(info);
		}
		in.close();

	}

}
