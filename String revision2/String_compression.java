package String_revision;

public class String_compression {
    static void main() {
        char [] arr = {'a','a','a','b','b','c','c','d'};
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = 0; int j = 0;
        while(j<arr.length){
            if(arr[i] == (arr[j])){
                count++;
                j++;
            }else{
                if(count == 1){
                    sb.append(arr[i]);
                }else{
                    sb.append(arr[i]);
                    sb.append(Integer.toString(count));
                }
                count = 0;
                i=j;
            }
        }
        if(count == 1){
            sb.append(arr[i]);
        }else{
            sb.append(arr[i]);
            sb.append(Integer.toString(count));
        }
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }
}
