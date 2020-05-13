Question 1

Part A

String w = word;

String str = ""; //new String

if (w.length() == 0) {
  return w;
} else {
  while (w.length > 0) {
    while(w.length > 2) {
      if (w.charAt(0) == 'a') {
        if (w.charAt(1) != 'a') {
          str += w.charAt(1) + w.charAt(0);
          w = w.substring(2);
        } else {
          str += w.charAt(0);
          w = w.substring(1);
        }
      }
      else {
        str += w.charAt(0);
        w = w.substring(1);
      }
    }
    if (w.length == 2) {
      if (w.charAt(0) == 'a' && w.charAt(1) != 'a') {
        str += w.charAt(1) + w.charAt(0);
        w = "";
      }
      else {
        str += w.charAt(1);
        w = s.substring(1);
      }
    }
    if (w.length == 1) {
      str += w;
      w = "";
    }
  }
  return str;
}

Part B
for (int i = 0; i < wordList.size(); i ++) {
  String str = wordList.get(i);
  String s = this.scrambleWord(str);
  if (s.equals(str)) wordList.remove(i);
  else str = s;
}

Question 2

Part A
