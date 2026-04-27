// StringUtils
class StringUtils {
  static boolean containsChar(String str, char letter){
    int index = str.indexOf(letter);
    if(index != -1){
      return true;
    }
    return false;
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
    int length = str.length();

    for(int i = 0; i < length; i++){
      if(str.charAt(i) == from){
        replaced += to;
      } else{
        replaced += str.charAt(i);
      }
    }
    return replaced;
  }
}