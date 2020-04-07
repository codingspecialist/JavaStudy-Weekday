package ch08;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputEx01 {
	public static void main(String[] args) {
		OutputStream out = System.out;
		OutputStreamWriter writer = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(writer);
		try {
			bw.write("FDasfdas");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
