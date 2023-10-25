class railfenceCipherHelper {
int depth;
String encode(String msg, int depth) throws Exception {
int r = depth;
int l = msg.length();
int c = l / depth;
int k = 0;
char mat[][] = new char[r][c];
String enc = &quot;&quot;;
for (int i = 0; i &lt; c; i++) {
for (int j = 0; j &lt; r; j++) {
if (k != l) {
mat[j][i] = msg.charAt(k++);
} else {
mat[j][i] = &#39;X&#39;;
}
}
}
for (int i = 0; i &lt; r; i++) {
for (int j = 0; j &lt; c; j++) {
enc += mat[i][j];
}

}
return enc;
}
String decode(String encmsg, int depth) throws Exception {
int r = depth;
int l = encmsg.length();
int c = l / depth;

int k = 0;
char mat[][] = new char[r][c];
String dec = &quot;&quot;;
for (int i = 0; i &lt; r; i++) {
for (int j = 0; j &lt; c; j++) {
mat[i][j] = encmsg.charAt(k++);
}
}
for (int i = 0; i &lt; c; i++) {
for (int j = 0; j &lt; r; j++) {
dec += mat[j][i];
}
}
return dec;
}
}
class railFenceCipher {
public static void main(String[] args) throws java.lang.Exception {
railfenceCipherHelper rf = new railfenceCipherHelper();
String msg, enc, dec;
msg = &quot;Anna University, Chennai&quot;;
int depth = 2;
enc = rf.encode(msg, depth);
dec = rf.decode(enc, depth);
System.out.println(&quot;Simulating Railfence Cipher\n-------------------------&quot;);
System.out.println(&quot;Input Message :&quot; + msg);
System.out.println(&quot;Encrypted Message :&quot; + enc);
System.out.printf(&quot;Decrypted Message :&quot; + dec);
}
}