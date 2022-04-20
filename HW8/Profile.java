import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.util.Map;
import java.util.Scanner;
public class Profile {
    private static HashMap<String, Integer> totals;
    private static ArrayList<String> names;
    private static ArrayList<Integer> counts;

    public static void main(String[] args) throws FileNotFoundException {
        names = new ArrayList<>();
        counts = new ArrayList<>();
        totals = new HashMap<>();
        if (args.length > 0){
            txtCounter(args[0]);
            Sorter();
            if (args.length > 1){
                for (int i = 0; i < Integer.parseInt(args[1]); i++){
                    System.out.print(i + 1 + ".");
                    System.out.print(names.get(i)+"="+counts.get(i));
                    System.out.println();
                }
            }else{
                for (int i = 0; i < names.size(); i++){
                    System.out.print(i + 1 + ".");
                    System.out.print(names.get(i)+"="+counts.get(i));
                    System.out.println();
                }
            }
        }
    }
    public static void txtCounter(String file) throws FileNotFoundException {
        File currentFile = new File(file);
        Scanner input = new Scanner(currentFile);
        String word;
        while (input.hasNextLine()) {
            word = input.nextLine();
            Scanner tokenizer = new Scanner(word);
            while (tokenizer.hasNext()) {
                String currentString = tokenizer.next();
                boolean inMap = false;
                for (Map.Entry<String, Integer> x : totals.entrySet()) {
                    if (currentString.equals(x.getKey())) {
                        inMap = true;
                        totals.put(currentString, x.getValue() + 1);
                        break;
                    }
                }
                if (!inMap) {
                    totals.put(currentString, 1);
                }
            }
        }
    }
    public static void Sorter(){
        for (Map.Entry<String, Integer> x : totals.entrySet()) {
            names.add(x.getKey());
            counts.add(x.getValue());
        }
        int max;
        int temp;
        String tempName;
        int index = 0;
        for (int i = 0; i < counts.size(); i++){
            max = counts.get(i);
            for (int j = i; j < counts.size(); j++) {
                if (counts.get(j) > max) {
                    max = counts.get(j);
                    index = j;
                }
            }
            temp = counts.get(i);
            counts.set(i, max);
            counts.set(index, temp);
            tempName = names.get(i);
            names.set(i, names.get(index));
            names.set(index, tempName);

        }
        String tempName2;
        for (int i = 0; i < names.size(); i++){

            for (int j = 1; j < names.size(); j++) {
                if (counts.get(j) == counts.get(j-1)) {
                    if (names.get(j-1).compareTo(names.get(j)) > 0){
                        tempName2 = names.get(j-1);
                        names.set(j-1, names.get(j));
                        names.set(j, tempName2);
                    }
                }
            }
        }
    }
}
