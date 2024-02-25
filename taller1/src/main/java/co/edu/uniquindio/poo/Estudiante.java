package co.edu.uniquindio.poo;

public class Estudiante {
    private String  name;
    private String lastName;
    private String ID;
    private String mail;
    private String phone;
    private int age;  
    

    // Condicionales y mensajes de error para respuestas erróneas
    public Estudiante(String name, String lastName, String ID, String mail, String phone, int age) {
        assert name != null && !name.isBlank() : "El nombre debe ser diferente";
        assert lastName != null && !lastName.isBlank() : "El apellido debe ser diferente";
        assert ID != null && !ID.isBlank() : "El número de identificación debe ser diferente";
        assert mail != null && mail.contains("@") : "El correo electrónico debe tener por lo menos un arroba (@) y no puede estar vacío";
        assert phone != null : "El teléfono no puede ser nulo";
        assert age > 0 : "La edad debe ser mayor a cero";

        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    // Setters & Getters
    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Estudiante: " + '\n' +
                "-Nombres: " + name + '\n' + 
                "-Apellidos: " + lastName + '\n' +
                "-Numero de identificación: " + ID + '\n' +
                "-Correo: " + mail + '\n' +
                "-Teléfono: " + phone + '\n' +
                "-Edad: " + age + '\n' + '\n' ;
    }
}
