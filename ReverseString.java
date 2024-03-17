public class ReverseString {
    static boolean containsNumber(String str){
        char[] cha = str.toCharArray();
        for(char c : cha){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "My name is Akshay and I am 40 years old";
        String[] str2 = str.split(" ");
        int n = str2.length;
        String[] reverse = new String[n];
        int i=0;
        for(i=0;i<n;++i){
            if(containsNumber(str2[n-i-1])){
                reverse[i] = str2[n-i-1];
                break;
            }
            else{
                reverse[i] = str2[n-i-1];
            }
        }
        int c = 0;
        for(int k=i+1;k<n;++k){
            reverse[k] = str2[c++];
        }
        for(int j=0;j<n;++j){
            System.out.print(reverse[j]+" ");
        }
    }
}
