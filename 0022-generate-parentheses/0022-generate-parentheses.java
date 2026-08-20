class Solution {
    static void generate(int l, int r, String str, int n, ArrayList<String> arr) {
        if (l == n && r == n) {
            arr.add(str);
            return;
        }

        if (l < n) {
            generate(l+1, r, str + "(", n, arr);
        }

        if (r < l) {
            generate(l, r+1, str + ")", n, arr);
        }
    }

    // public ArrayList<String> generateParentheses(int n) {
    //     ArrayList<String> arr = new ArrayList<>();
    //     generate(0, 0, "", n/2, arr);
    //     return arr;
    // }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr = new ArrayList<>();
        generate(0, 0, "", n, arr);
        return arr;
    }
}