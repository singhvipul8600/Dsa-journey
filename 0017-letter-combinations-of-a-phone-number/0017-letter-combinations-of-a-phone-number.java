class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits.length()==0){
            return result;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4',  "ghi");
        map.put('5' ,  "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");

        solve(digits, 0, "",map,result);
        return result;
    }
    private void solve(String digits,
    int index,
    String current,
    HashMap<Character,String> map,
    List<String> result){
        if(index == digits.length()) {
            result.add(current);
            return;

        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (char ch : letters.toCharArray()){
            solve(digits,index+1,current+ch,map,result);

        }
        }

        
    }