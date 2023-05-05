class Solution {
    int search(String p, String s) {
        if (p.length() > s.length()) {
            return 0;
        }
        int[] pf = new int[26];
        int[] sf = new int[26];
        int c = 0;
        for (int i = 0; i < p.length(); i++) {
            pf[p.charAt(i) - 'a']++;
            sf[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pf, sf)) {
            c++;
        }
        for (int i = p.length(); i < s.length(); i++) {
            sf[s.charAt(i - p.length()) - 'a']--;
            sf[s.charAt(i) - 'a']++;
            if (Arrays.equals(pf, sf)) {
                c++;
            }
        }
        return c;
    }
}