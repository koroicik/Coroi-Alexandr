public class SequentialSearch {
   public static int search(String[] arr, String key) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i].equals(key)) {
            return i;
         }
      }
      return -1;
   }
}
