//int datatype
public class linearsearch {
    public static int linearsearch(int numbers[],int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }    
        return -1; 
    }    
    public static void main(String args[]){
        int numbers[]={13,16,4,5,6,7,67,32};
        int key=7;

        int index = linearsearch(numbers,key);

        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("The key is found at position " + index);
        }
    }
}

//String datatype
public class linearsearch{
    public static int linearsearch(String menu[], String key){
        for(int i=1;i<menu.length;i++){
            if(menu[i].equals(key)){   //Very important
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[]= {"dosa", "chips", "cola","burger"};
        String key = "chips";

        int index = linearsearch(menu,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at position " + index);
        }
    }
}
