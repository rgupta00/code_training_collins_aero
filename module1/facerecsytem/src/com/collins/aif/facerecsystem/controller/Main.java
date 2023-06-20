package com.collins.aif.facerecsystem.controller;

import com.collins.aif.facerecsystem.ui.Face;

//raj
public class Main {
	
	public static void main(String[] args) {
		//we have imported the face class from ui package
		Face face=new Face();
		face.printFacePixelOnUi();
		//
		
		//one of them must be fully qualified ...it will not work otherwise
		com.collins.aif.facerecsystem.db.Face face2=
				new com.collins.aif.facerecsystem.db.Face();
		
		face2.saveFacePixelOnDb();
		
	}

}
