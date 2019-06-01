import java.util.Stack;
 

public class balancingSymbol{
 
 public static void main(String[] args){

}
 
public static boolean isBalanceSymbolInExpression(String characters) {
      Stack<Character> str = new Stack<Character>();
      if(characters == null || characters.length() == 0){
           return false;
         
      } else {    
        for(int i = 0; i < characters.length(); i++){
 
          if (characters.charAt(i) == '(' || characters.charAt(i) == '{' || characters.charAt(i) == '[' ) {
          str.push(characters.charAt(i));
          } else if(characters.charAt(i) == ')') {
       if(!str.isEmpty() && str.peek() == '(') {
             str.pop();
         }else {
             return false;
        }
          } else if (characters.charAt(i) == ']') {
               if(!str.isEmpty() && str.peek() == '[') {
                  str.pop();
              } else {
                  return false;
              }
          } else if(characters.charAt(i) == '}'){
              if(!str.isEmpty() && str.peek() == '{') {
                  str.pop();
              } else {
                  return false;
              }
          }
        }
        if(str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
 }
}
