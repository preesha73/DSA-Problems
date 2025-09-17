import java.nio.file.Paths;
class Solution {
    public String simplifyPath(String path) {
        return Paths.get(path).normalize().toString();
    }
}