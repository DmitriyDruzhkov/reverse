public class Reverse {
    public static void main(String[] args) {
        String string = "J@va the be$t!123";
        char[] chars = string.toCharArray();

        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(chars);
    }
}
