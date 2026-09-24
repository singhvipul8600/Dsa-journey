class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Create HashMap  Mapping from s to t
        HashMap<Character,Character> map =new HashMap<>();
        // Create HashSet
        HashSet<Character> used = new HashSet<>();
         // Loop through the Strings 
        for(int i =0;i< s.length();i++) {
          // Get characters 
            char a = s.charAt(i);
            char b = t.charAt(i);
            // Checking if mapping already exits
            if(map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false; 
                     }
            }
                else {
                    if (used.contains(b)) {
                        return false;

                    }
                    map.put(a, b);
                    used.add(b);
                }
            }
            return true;
        }
    }