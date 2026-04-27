// StringUtils
class StringUtils {
  static boolean containsChar(String str, char letter){
    int index = str.indexOf(letter);
    return index != -1;
  }
  
  static String reverse(String str){
    String reversed = "";
    int length = str.length();

    for(int i = 0; i < length; i++){
      reversed += str.charAt(length-1-i);
    }
    return reversed;
  }
  
  static String replaceAll(String str, char from, char to){
    String replaced = "";

    for(int i = 0; i < str.length(); i++){
      char charAt = str.charAt(i);
      char letter = charAt == from ? to : charAt;
      replaced += letter;
    }
    return replaced;
  }
}