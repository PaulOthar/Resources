public class BitmapScriptManager {
	public static int[] readBitmapScript(String BitmapScript) {
		String[] lineSplitted = BitmapScript.split("\n");
		String[] spaceSplitted = null;
		
		int width = 0;int heigth = 0;
		boolean w = false,h = false;
		
		for(int i = 0;i<lineSplitted.length;i++) {
			if(w&&h) {
				break;
			}
			spaceSplitted = lineSplitted[i].split(" ");
			if(spaceSplitted[0] == "w") {
				w = true;
				width = Integer.parseInt(spaceSplitted[1],16);
			}
			else if(spaceSplitted[0] == "h") {
				h = true;
				heigth = Integer.parseInt(spaceSplitted[1],16);
			}
		}
		
		int[] output = new int[width * heigth];
		output[0] = width;
		output[1] = heigth;
		
		int outputted = 2;
		
		for(int i = 0;i<lineSplitted.length;i++) {
			spaceSplitted = lineSplitted[i].split(" ");
			if(spaceSplitted[0] == "p") {
				output[outputted] = Integer.parseInt(spaceSplitted[1],16);
				outputted++;
			}
		}
		
		return output;
	}
	
	public static String writeBitmapScript(int[] bitmap) {
		String output = new String();
		
		output += String.format("w %s", Integer.toHexString(bitmap[0]));
		output += "\n";
		output += String.format("h %s", Integer.toHexString(bitmap[0]));
		output += "\n";
		
		for(int i = 2;i<bitmap.length;i++) {
			if(i > 2) {
				output += "\n";
			}
			output += String.format("p %s", Integer.toHexString(bitmap[i]));
		}
		
		return output;
	}
}