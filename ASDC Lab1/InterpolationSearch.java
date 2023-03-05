public class InterpolationSearch {
   public static int search(int[] arr, int key) {
      int left = 0;
      int right = arr.length - 1;

      while (left <= right && key >= arr[left] && key <= arr[right]) {
         int pos = left + ((key - arr[left]) * (right - left)) / (arr[right] - arr[left]);
         if (arr[pos] == key) {
            return pos;
         }
         if (arr[pos] < key) {
            left = pos + 1;
         } else {
            right = pos - 1;
         }
      }
      return -1;
   }
}
