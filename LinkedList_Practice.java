import java.util.LinkedList;
public class LinkedList_Practice {
    public static void main(String[] args) {
        //Making new empty LinkedList
        LinkedList<String> list_one = new LinkedList();
        
        //Appending Values to empty list
        list_one.add("red");  
        list_one.add("green");
        list_one.add("yellow");
        System.out.println("Initial List with three appended values: " + list_one);

        //Iterating through list
        System.out.println("\nList where values are looped through on each line: ");
        for(String number : list_one) {
            System.out.println(number);
        }

        //Replacing Values into list
        list_one.set(1, "orange");

        //Inserting Values into list
        list_one.add(1, "blue");
        
        //New LinkedList
        LinkedList<String> list_two = new LinkedList();
        list_two.add("purple");
        list_two.add("pink");

        //Joining Lists
        list_one.addAll(list_two);

        //Removing First Value in List
        list_one.pop();
        System.out.println("\nNew list with updated values: " + list_one);
    }
}
