import java.util.ArrayList;


public class Exceptions {
    public ArrayList<String> testing(){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        // myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
    		Integer castedValue = (Integer) myList.get(i);
		}

        return myList;
    }
}