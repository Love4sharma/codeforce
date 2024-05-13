// ^_^ Code Submitted By Lucifer ^_^ \

import java.io.*;
import java.lang.*;
import java.util.*;

public class BlackAndWhiteStrip {

      static long mod = 1000000007;

      public static void main(String[] args) throws java.lang.Exception {
            Reader sc = new Reader();
            int t = sc.nextInt();
            while (t-- > 0) {
                  int n = sc.nextInt();
                  int k = sc.nextInt();
                  String s = sc.readLine();

                  int ans = Integer.MAX_VALUE;
                  int i = 0;
                  int count = 0;

                  for (int j = 0; j < n; j++) {
                        if (s.charAt(j) == 'B') {
                              count++;
                        }

                        if (j - i + 1 == k) {
                              if (count >= k) {
                                    ans = 0;
                                    break;
                              } else {
                                    ans = Math.min(ans, k - count);
                              }

                              if (s.charAt(i) == 'B') {
                                    count--;
                              }
                              i++;
                        }
                  }

                  System.out.println(ans);
            }
      }

      // public static boolean sqrt(int n) {
      // int a = (int)Math.sqrt(n);
      // return a * a == n;
      // }

      // public static class Pair<F, S> {

      // public final F first;
      // public final S second;

      // public Pair(F first, S second) {
      // this.first = first;
      // this.second = second;
      // }
      // }

      // Pair<Integer, Integer>[] c = new Pair[n];

      // for (int i = 0; i < n; ++i) {
      // s.charAt(i) = new Pair<>(a[i], b[i]);
      // }
      // Arrays.sort(c, (pair1, pair2) -> pair1.first.compareTo(pair2.first));
      // for (int i = 0; i < n; ++i) {
      // a[i] = s.charAt(i).first;
      // b[i] = s.charAt(i).second;
      // }

      // Map<Integer, Integer> map = new HashMap<>();

      // for (int num : nums) {
      // map.put(num, map.getOrDefault(num, 0) + 1);
      // }

      // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      // if (entry.getValue() == 1) {
      // result.add(entry.getKey());
      // }
      // }

      // public static int longestCommonSubstring(char X[], char Y[], int m, int n) {
      // int a[][] = new int[m + 1][n + 1];

      // int ans = 0;
      // for (int i = 0; i <= m; i++) {
      // for (int j = 0; j <= n; j++) {
      // if (i == 0 || j == 0) a[i][j] = 0; else if (X[i - 1] == Y[j - 1]) {
      // a[i][j] = a[i - 1][j - 1] + 1;
      // ans = Integer.max(ans, a[i][j]);
      // } else a[i][j] = 0;
      // }
      // }
      // return ans;
      // }

      // public static boolean prime(long x) {
      // for (int i = 2; i * i <= x; i++) if (x % i == 0) return false;
      // return true;
      // }

      // public static int gcd(int a, int b) {
      // return b == 0 ? a : gcd(b, a % b);
      // }

      // public static int lcm(int[] a, int i) {
      // if (i == a.length - 1) {
      // return a[i];
      // }
      // int b = a[i];
      // int c = lcm(a, i + 1);
      // return (b * c / gcd(b, c));
      // }

      // public static boolean sorted(int a[], int n) {
      // for (int i = 0; i < n - 1; i++) {
      // if (a[i] > a[i + 1]) return false;
      // }
      // return true;
      // }

      static class Reader {

            private final int BUFFER_SIZE = 1 << 16;
            private DataInputStream din;
            private byte[] buffer;
            private int bufferPointer, bytesRead;

            public Reader() {
                  din = new DataInputStream(System.in);
                  buffer = new byte[BUFFER_SIZE];
                  bufferPointer = bytesRead = 0;
            }

            public Reader(String file_name) throws IOException {
                  din = new DataInputStream(new FileInputStream(file_name));
                  buffer = new byte[BUFFER_SIZE];
                  bufferPointer = bytesRead = 0;
            }

            public String readLine() throws IOException {
                  byte[] buf = new byte[200001]; // line length
                  int cnt = 0, c;
                  while ((c = read()) != -1) {
                        if (c == '\n') {
                              if (cnt != 0) {
                                    break;
                              } else {
                                    continue;
                              }
                        }
                        buf[cnt++] = (byte) c;
                  }
                  return new String(buf, 0, cnt);
            }

            public int nextInt() throws IOException {
                  int ret = 0;
                  byte c = read();
                  while (c <= ' ') {
                        c = read();
                  }
                  boolean neg = (c == '-');
                  if (neg)
                        c = read();
                  do {
                        ret = ret * 10 + c - '0';
                  } while ((c = read()) >= '0' && c <= '9');

                  if (neg)
                        return -ret;
                  return ret;
            }

            public long nextLong() throws IOException {
                  long ret = 0;
                  byte c = read();
                  while (c <= ' ')
                        c = read();
                  boolean neg = (c == '-');
                  if (neg)
                        c = read();
                  do {
                        ret = ret * 10 + c - '0';
                  } while ((c = read()) >= '0' && c <= '9');
                  if (neg)
                        return -ret;
                  return ret;
            }

            public double nextDouble() throws IOException {
                  double ret = 0, div = 1;
                  byte c = read();
                  while (c <= ' ')
                        c = read();
                  boolean neg = (c == '-');
                  if (neg)
                        c = read();

                  do {
                        ret = ret * 10 + c - '0';
                  } while ((c = read()) >= '0' && c <= '9');

                  if (c == '.') {
                        while ((c = read()) >= '0' && c <= '9') {
                              ret += (c - '0') / (div *= 10);
                        }
                  }

                  if (neg)
                        return -ret;
                  return ret;
            }

            private void fillBuffer() throws IOException {
                  bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                  if (bytesRead == -1)
                        buffer[0] = -1;
            }

            private byte read() throws IOException {
                  if (bufferPointer == bytesRead)
                        fillBuffer();
                  return buffer[bufferPointer++];
            }

            public void close() throws IOException {
                  if (din == null)
                        return;
                  din.close();
            }
      }
}
