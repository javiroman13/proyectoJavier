public class TestStudent {
    public static void main(String[] args) {
        System.out.println("probando clase student");
        
        Student javier = new Student();
        javier.setName("javier");
        javier.setLastName("roman");
        javier.setCareer("ingenieria informatica");
        javier.setControlNumber(22670018);
        javier.setSemester("segundo");

        Student estudend2 = new Student();
        estudend2.setName("fernanda");
        estudend2.setLastName("roman");
        estudend2.setCareer("ingenieria imformatica");
        estudend2.setSemester("segundo");
        estudend2.setControlNumber(22670017);

        estudend2.mostrarInf();

        javier.mostrarInf();











    }
}
