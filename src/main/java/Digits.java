import java.util.ArrayList;

public class Digits
{

private ArrayList<Integer> digitList;

public Digits(int num)
{ 
digitList = new ArrayList <Integer>();
String str = "" + num;
    for (int i = 0; i < str.length(); i++)
        digitList.add(str.charAt(i) - '0');
}
    
}

public boolean isStrictlyIncreasing()
{ 
for(int i = 0; i < digitList.size()-1; i++){
if(digitList.get(i) <=digitList.get(i))
return false; 
    return true;
}
}
