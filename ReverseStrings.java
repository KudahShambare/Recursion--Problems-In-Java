//Reverse a string using recursion

public class ReverseStrings{
    //main method
    public static void main(String[] args){
System.out.println(reverse("abcdef"));

    }
    //rrecursive method

    public static String reverse(String str){
      if(str.length()==1)  return str;
      else{
String last=str.substring(str.length()-1);

return last+reverse(str.substring(0,str.length()-1));
      }
    }
}