Question 1

Part A
public Digits(int num) {
  int n = num;
  int a = 0;
  while (n != 0) {
    a = n%10;
    digitList.add(a);
    n = n/10;
  }

}

Part B
public boolean isStrictlyIncreasing()  {
  int a = 0;
  int b = 0;
  int c = 0;
  for (int i = 0; i < digitList.size()- 1; i++) {
    a = digitList.get(i);
    b = digitList.get(i + 1);
    if (b <= a) return false;
  }

  c = digitList.get(digitList.size() - 1);
  if (c <= b) return false;

  return true;
}
