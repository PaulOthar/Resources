    public static int rgbyte(int color) {
		    int intensity = color & 0b1100_0000;
		    int red = color & 0b0011_0000;
		    int green = color & 0b0000_1100;
		    int blue = color & 0b0000_0011;
		
		    intensity /= 0b0100_0000;
		
		    red *= 0x1000;
		    green *= 0x40;
		
		    red = (red*21) + (red*intensity*21);
		    green = (green*21)+(green*intensity*21);
		    blue = (blue*21)+(blue*intensity*21);
		
		    return red+green+blue;
	  }
![image](https://user-images.githubusercontent.com/64809360/227963183-8bb94c9f-59f1-4a15-967c-ce42aed82647.png)
