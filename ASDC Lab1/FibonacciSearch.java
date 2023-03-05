public class FibonacciSearch {
   public static int search(int[] arr, int key) {
      int n = arr.length;
      int fib2 = 0;
      int fib1 = 1;
      int fib = fib2 + fib1;

      while (fib < n) {
         fib2 = fib1;
         fib1 = fib;
         fib = fib2 + fib1;
      }

      int offset = -1;

      while (fib > 1) {
         int i = Math.min(offset + fib2, n - 1);
         if (arr[i] < key) {
            fib = fib1;
            fib1 = fib2;
            fib2 = fib - fib1;
            offset = i;
         } else if ((arr[i] > key) {
fib = fib2;
fib1 = fib1 - fib2;
fib2 = fib - fib1;
} else {
return i;
}
}
  if (fib1 == 1 && arr[offset + 1] == key) {
     return offset + 1;
  }

  return -1;
}
}


