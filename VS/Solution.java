
class romanNumeral {
  public static void main(String[] args) {
    String romNum = "MCXI";
    int romNumLength = romNum.length();
    int romNumInt[] = new int[romNumLength];
    for (int i = 0; i < romNumLength; i++) {
      if (romNum.charAt(i) == 'I') {
        romNumInt[i] = 1;
      } else if (romNum.charAt(i) == 'V') {
        romNumInt[i] = 5;
      }  else if (romNum.charAt(i) == 'X') {
        romNumInt[i] = 10;
      } else if (romNum.charAt(i) == 'L') {
        romNumInt[i] = 50;
      } else if (romNum.charAt(i) == 'C') {
        romNumInt[i] = 100;
      } else if (romNum.charAt(i) == 'D') {
        romNumInt[i] = 500;
      } else if (romNum.charAt(i) == 'M') {
        romNumInt[i] = 1000;
      }
    }

    int numVal = 0;
    for (int i = 0; i < romNumLength; i++) {
      if (i == romNumLength - 1) {
        numVal += romNumInt[i];
      } else if (romNumInt[i] == 1 && (romNumInt[i+1] == 5 || romNumInt[i+1] == 10)) {
        numVal += romNumInt[i+1] - romNumInt[i];
        i++;
      } else if (romNumInt[i] == 10 && (romNumInt[i+1] == 50 || romNumInt[i+1] == 100)) {
        numVal += romNumInt[i+1] - romNumInt[i];
        i++;
      }  else if (romNumInt[i] == 100 && (romNumInt[i+1] == 500 || romNumInt[i+1] == 1000)) {
        numVal += romNumInt[i+1] - romNumInt[i];
        i++;
      } else {
        numVal += romNumInt[i];
      }
    }
    System.out.println(numVal);
  }
}