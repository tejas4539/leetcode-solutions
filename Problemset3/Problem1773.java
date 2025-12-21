import java.util.List;

class Problem1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> innerList = items.get(i);
            if (ruleKey.equals("type")) {
                if (innerList.get(0).equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.equals("color")) {
                if (innerList.get(1).equals(ruleValue)) {
                    count++;
                }
            } else {
                if (innerList.get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}