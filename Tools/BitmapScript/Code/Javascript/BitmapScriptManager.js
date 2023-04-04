class BitmapScriptManager{
    static readBitmapScript(bitmapScript){
        let lineSplitted = bitmapScript.split("\n");
        let spaceSplitted = null;

        let width = 0;let heigth = 0;
        let w = false;let h = false;

        for(let i = 0;i<lineSplitted.length;i++){
            if(w&&h) {
				break;
			}
			spaceSplitted = lineSplitted[i].split(" ");
			if(spaceSplitted[0] == "w") {
				w = true;
				width = parseInt(spaceSplitted[1],16);
			}
			else if(spaceSplitted[0] == "h") {
				h = true;
				heigth = parseInt(spaceSplitted[1],16);
			}
        }

        let output = new Array(width * heigth);
		output[0] = width;
		output[1] = heigth;
		
		let outputted = 2;
		
		for(let i = 0;i<lineSplitted.length;i++) {
			spaceSplitted = lineSplitted[i].split(" ");
			if(spaceSplitted[0] == "p") {
				output[outputted] = parseInt(spaceSplitted[1],16);
				outputted++;
			}
		}
		
		return output;
    }

    static writeBitmapScript(bitmap){
        let output = new String();

		output += `w ${bitmap[0].toString(16)}`;
		output += "\n";
		output += `h ${bitmap[1].toString(16)}`;
		output += "\n";
		
		for(let i = 2;i<bitmap.length;i++) {
			if(i > 2) {
				output += "\n";
			}
			output += `p ${bitmap[i].toString(16)}`;
		}
		
		return output;
    }
}