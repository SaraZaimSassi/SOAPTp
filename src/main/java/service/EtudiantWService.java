package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.model.Genre;
import org.example.model.student;

import java.util.List;

@WebService(serviceName = "serviceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "listStudents")
    public List<student> listEtudiants(){
        return List.of(
                new student(1,"ET_Nom1","ET_Prénom1", Genre.Homme),
                new student(2 ,"ET_Nom2","ET_Prénom2", Genre.Femme),
                new student(3 ,"ET_Nom3","ET_Prénom3", Genre.Homme)
        );
    }
}