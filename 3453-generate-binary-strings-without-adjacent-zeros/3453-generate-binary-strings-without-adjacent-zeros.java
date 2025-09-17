class Solution {
    public void solve(int zero, int one, int n, String c, List<String> r){
        if(c.length() == n){
            r.add(c);
            return;
        }
        if(zero == n){
            solve(zero - 1, one, n, c + "0", r);
        } else if(zero >= one && (c.length() > 0 && c.charAt(c.length() - 1) != '0')){
            solve(zero - 1, one, n, c + "0", r);
        }
        solve(zero, one - 1, n, c + "1", r);
    }
    public List<String> validStrings(int n) {
        List<String> r = new ArrayList<>();
        String c = "";
        solve(n, n, n, c, r);
        return r;
    }
}