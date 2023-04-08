public class Main {
    public static void main(String[] args) {
        printStringArray(args);
        String [] result = new String[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i].length()<=3) {
                String [] array = new String [result.length+1];
                if (result.length>0){
                    for (int j = 0; j < result.length; j++) {
                        array[j] = result[j];
                    }
                }
                array[result.length] = args[i];
                result = array;
            }
        }
        printStringArray(result);
    }
    public static void printStringArray(String[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i!= array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]\r\n");
    }
}
