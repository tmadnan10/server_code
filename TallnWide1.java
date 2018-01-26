package org.qcri.sparkpca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TallnWide1 {
	static int partitionCount;
	static int D,d,round;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		partitionCount = Integer.parseInt(args[0]);
		D = Integer.parseInt(args[1]);
		d = Integer.parseInt(args[2]);
		round = Integer.parseInt(args[3]);
		for (int k = 0; k < partitionCount; k++) {
			File currentCheckFile = new File("doneW"+k);
			while(!currentCheckFile.exists()){
				System.out.println("doneW"+k+" Not Exists");
				Thread.sleep(4000);
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter("W"+k));
			for (int i = 0; i < D-1; i++) {
				String line = "";
				for (int j = 0; j < d; j++) {
					line += "1 ";
					Thread.sleep(1);
				}
				line += "1\n";
				bw.write(line);
			}
			bw.flush();
			bw.close();
			String command = "./accumulate.sh "+k+ " "+D+" "+d;
			Process p;
			//String commandString = "./test.sh "+neighbours[i]+" "+myFileName;
			p = Runtime.getRuntime().exec(command);
			//p.waitFor();
			System.out.println("Called Accumulation for W"+k);
		}
		
		System.out.println("Hello World");
	}
}
