class Solution {
    public int compareVersion(String version1, String version2) {
        int min = Math.min(version1.length(), version2.length());

        ArrayList<Integer> one = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < version1.length(); i++) {
            char current = version1.charAt(i);

            if (current != '.') {
                sum = sum * 10 + (int) (current - '0');
            } else {
                one.add(sum);
                sum = 0;
            }
        }
        one.add(sum); // Adding the last number

        sum = 0;
        ArrayList<Integer> two = new ArrayList<>();

        for (int i = 0; i < version2.length(); i++) {
            char current = version2.charAt(i);

            if (current != '.') {
                sum = sum * 10 + (int) (current - '0');
            } else {
                two.add(sum);
                sum = 0;
            }
        }
        two.add(sum); // Adding the last number

        for (int i = 0; i < Math.min(one.size(), two.size()); i++) {
            if (one.get(i) > two.get(i)) {
                return 1; // version1 > version2
            } else if (one.get(i) < two.get(i)) {
                return -1; // version1 < version2
            }
        }

        // Check if any remaining segments contain non-zero values
        for (int i = Math.min(one.size(), two.size()); i < one.size(); i++) {
            if (one.get(i) > 0) {
                return 1; // version1 > version2
            }
        }

        for (int i = Math.min(one.size(), two.size()); i < two.size(); i++) {
            if (two.get(i) > 0) {
                return -1; // version1 < version2
            }
        }

        return 0; // version1 == version2
    }
}
