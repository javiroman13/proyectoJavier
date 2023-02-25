public class Student {

    //atributos
        private String Name;
        private String LastName;
        private Integer ControlNumber;
        private String career;
        private String Semester;


// metodos getter


    public String getName() {
        return this.Name;
    }

    public String getLastName() {
        return this.LastName;
    }

    public long getControlNumber() {
        return this.ControlNumber;
    }

    public String getCareer() {
        return this.career;
    }
    public String getSemester() {
        return this.Semester;
    }

    //metodos setter

    public void setName(String name) {
        this.Name=name;
    }

    public void setLastName(String apellido) {

        this.LastName=apellido;
    }

    public void setControlNumber(Integer controlNumber) {
        this.ControlNumber = controlNumber;
    }

    public void setSemester(String semester) {
        this.Semester = semester;
    }

    public void setCareer(String career) {
        this.career = career;
    }


    public void mostrarInf() {
        System.out.println("el nombre es:"+getName()
                +"\napellido:"+getLastName()
                +"\nnumero de control:"+getControlNumber()
                +"\ncarrera:"+getCareer()
                +"\nsemetre:"+getSemester());


    }
    }



