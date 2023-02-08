import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Bolot", LocalDate.of(1995,9,03), +77794566, "Kyrgyz");
        Student student1 = new Student("Oksana",LocalDate.of(1997,3,01),+565432555,"Kyrgyz");
        Student student2 = new Student("Sanjar",LocalDate.of(1998,5,07),+706889353,"Kyrgyz");
        Student student3 = new Student("Roma",LocalDate.of(2001,3,05),+777086532,"Russian");
        Student student4 = new Student("Kayrat",LocalDate.of(2002,1,10),+999453794,"Kyrgyz");

        Student[]students={student,student1,student2,student3,student4};
        for ( Student s: students) {

            System.out.println(s.getName()+"  "+
                       s.getDateOfbirth() + "  " +
                       s.getPhoneNumber()+ "  "+
                       s.getNationality());


        }

    }


    }




