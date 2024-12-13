class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //First use a simple string with a z in it
    String msg ="ABCZ";

    //String encodedMsg = encode(msg);
    
    //System.out.println("Original msg: "+msg);
    //System.out.println("encoded msg: "+encodedMsg);

    // now read a file encode and save file
    //msg = Input.readFile("Original.txt");
    //encodedMsg = encode(msg);
    //Input.writeFile("Encode.txt",encodedMsg);

    // now decode the encode message

    //encodedMsg = Input.readFile("Encode.txt");
    //String decodedMsg = decode(encodedMsg);
    //Input.writeFile("Decoded.txt",decodedMsg);
    
    
  }

   String encode(String s){
		String bld="";
		
		for(int x=0; x< s.length(); x++){
			char ch = s.charAt(x);
			int ascii = (int)ch;
			ascii++;
			if(ch == 'Z')
				ch='A';
			else
				ch = (char)ascii;
			
			bld+= ch;
		}
		return bld;
	} 
	
	String decode(String s){
		String bld="";
		
		for(int x=0; x< s.length(); x++){
			char ch = s.charAt(x);
			int ascii = (int)ch;
			ascii--;
			if(ch == 'A')
				ch='Z';
			else
				ch = (char)ascii;
			
			bld+= ch;
		}
		return bld;
	} 

  
  

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}