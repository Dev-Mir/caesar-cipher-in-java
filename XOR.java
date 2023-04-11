public class XOR {
    public static void main(String[] args) {
        
        String cypher = "0101011";
        String key =    "1101110";

        char[] ch1 = cypher.toCharArray();
        char[] ch2 = key.toCharArray();

        String plaintext = "";

        for(int i=0; i<cypher.length(); i++){

            if(ch1[i]==ch2[i]){
                plaintext += "0";
            }
            else{
                plaintext += "1";
            }
        }
        System.out.println(cypher+"\n"+ key+"\n-------\n"+plaintext);
    }
}
