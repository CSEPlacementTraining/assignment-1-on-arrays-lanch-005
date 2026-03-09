class Assignment1 {
  public static int[] findLeapYears(int year) {

    
    int[] arr = new int[15];
    int i = 0;

    while(i < 15){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            arr[i] = year;
            i++;
        }
        year++;
    }

    return arr;
  }
  
  public static void main(String[] args) {
    int year = 2000;
    int[] leapYears;
    leapYears = findLeapYears(year);
    for (int index = 0; index < leapYears.length; index++) {
      System.out.println(leapYears[index]);
    }
  }
}