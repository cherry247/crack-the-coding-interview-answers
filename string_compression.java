 class b{
	 public static void main(String args[]){
		 String s="aabcccccaa";
		 System.out.print(compress(s));
	 }
	 public static String compress(String s){
		 int fl=compresslength(s);
		 if(fl>=s.length()) return s;
		 StringBuilder comp=new StringBuilder(fl);
		 int countconsi=0;
		 for(int i=0;i<s.length();i++){
			 countconsi++;
			 if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1))
			 {
				 comp.append(s.charAt(i));
				 comp.append(countconsi);
				 countconsi=0;
			 }				 

		 }
		 return comp.toString();
		 
	 }
	 public static int compresslength(String s)
	 {
		 int comlen=0;
		 int countconsi=0;
		 for(int i=0;i<s.length();i++){
			 countconsi++;
			 if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1))
			 {
				 comlen+=1+String.valueOf(countconsi).length();
				 countconsi=0;
			 }				 

		 }
		 return comlen;
	 }
 
	 
 }