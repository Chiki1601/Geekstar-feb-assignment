// write program to print different courses needs to be studied by Student of Different years and branch


class Student {
  public static void main(String[] args) {

    int semester = 1;
    String subjects;

    // switch statement to check size
    switch (semester) {

      case 1:
        subjects = "BME","BEE","EGD","PHYSICS","MATHS";
        break;

      case 2:
         subjects = "PPS","ES","ENGLISH","BE","MATH2";
        break;

      case 3:
         subjects = "DS","DBMS","DE","ETC","IC","MATHS3";
        break;

      case 4:
         subjects = "OS","MATHS4","PEM","COA","OOP";
        break;
	
	case 5:
         subjects = "CS","SE","ADA","CN","CPD","PE";
        break;
	case 6:
         subjects = "IOT","MI","AJT","TOC","DMW","CPDP";
        break;
	case 7:
         subjects = "IS","AI","MAD","NLP","CC",""CD;
        break;
	case 8:
         subjects = "INTERNSHIP";
        break;
      
      default:
        subjects = "Unknown";
        break;

    }
    System.out.println("SEM: " + subjects);
  }
}
