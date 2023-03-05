public class BinarySearch {
   public static int search(String[] arr, String key) {
      int left = 0;
      int right = arr.length - 1;

      while (left <= right) {
         int mid = (left + right) / 2;
         if (arr[mid].compareTo(key) == 0) {
            return mid;
         }
         if (arr[mid].compareTo(key) < 0) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }
      return -1;
   }
}
