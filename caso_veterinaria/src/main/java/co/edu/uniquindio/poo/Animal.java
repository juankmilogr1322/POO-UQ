package co.edu.uniquindio.poo;

public record Animal(String name, String species, String race, int age, String gender, String color, int weight) {

    //Mensajes de posibles errores
    public Animal {
    assert name != null && !name.isBlank() : "El nombre debe ser diferente de null y de un espacio en blanco           ";
    assert species != null && !species.isBlank() : "La especie debe ser diferente";
    assert race != null && !race.isBlank() : "El número de identificación debe ser diferente";
    assert age > 0 : "La edad debe ser diferente";
    assert gender != null : "El genero debe ser diferente";
    assert color != null : "La edad debe ser mayor a cero";
    assert weight >= 0 : "El peso debe ser diferente";

    }
    
    

}

