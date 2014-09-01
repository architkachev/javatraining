import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserBlocks implements Parser {
    String regexToParseBlocks;
    String inputString;


    public ParserBlocks() {
        this.regexToParseBlocks = "\\n(class|void)(.+[^}]\\s)+(}\\n)+";
    }


    @Override
    public ArrayList<Component> getArrayListComponents(String inputText) {
        ArrayList<Component> componentArrayList = new ArrayList<Component>();
        Pattern pattern = Pattern.compile(this.regexToParseBlocks);
        Matcher matcher = pattern.matcher(this.inputString);

        ArrayList<String> allblockText = new ArrayList<String>();
        for (String blockText: pattern.split(inputText)){
            allblockText.add(blockText);
        }

        ArrayList<String> allblockCode = new ArrayList<String>();
        while (matcher.find()){
            allblockCode.add(matcher.group());
        }

        int lengthCode = allblockCode.size();
        int lengthText = allblockText.size();
        int j = 0;
        while (j<(lengthText>=lengthCode?lengthText:lengthCode)){
            if(j < lengthText) {
                //allBook.add(allblockText.get(j));
                Leaf leaf = new Leaf(allblockText.get(j));
                componentArrayList.add(leaf);
            }
            if (j < lengthCode) {
                //allBook.add(allblockCode.get(j));
                Leaf leaf = new Leaf(allblockCode.get(j));
                componentArrayList.add(leaf);
            }
            j++;
        }

        return componentArrayList;
    }
}
