class Compute {
    public long[] printFirstNegativeInteger(long a[], int n, int k)
    {
        long[] p = new long[n - k + 1];
        int c = 0;
        Queue<Long> q = new LinkedList<>();

        int i = 0;
        for (int j = 0; j< n; j++) {
            if (a[j] < 0) {
                q.add(a[j]);
            }

            if (j - i + 1 == k) {
                if (q.isEmpty()) {
                    p[c++] = 0;
                } else {
                    long num = q.peek();
                    p[c++] = num;
                    if (num == a[i]) {
                        q.remove();
                    }
                }
                i++;
            }
        }

        return p;
    }
}