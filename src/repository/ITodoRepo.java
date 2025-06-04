package repository;

import entity.Todo;
import java.util.List;

/**
 * Interface for To-Do repository operations.
 */
public interface ITodoRepo {

    /**
     * Registers a new To-Do item.
     *
     * @param field1 Field 1 (Title of the Todo)
     * @param field2 Field 2 (Long type data for the Todo)
     * @param field3 Field 3 (Another Long type data)
     * @param field4 Field 4 (Description or any other field)
     * @param field5 Field 5 (Additional details)
     * @param password Password for security or validation.
     * @return Returns 1 if successfully added, -1 if failed.
     */
    int registerTodo(String field1, String field2, String field3, String field4, String field5, String password);

    /**
     * Adds a new member to the database.
     *
     * @param nama Name of the member.
     * @param jenisKelamin Gender of the member.
     * @param nik ID number.
     * @param noHp Phone number.
     * @param alamat Address of the member.
     * @return Returns 1 if successful, -1 if failed.
     */
    int addMemberToDatabase(String nama, String jenisKelamin, String nik, String noHp, String alamat);
   
  

    /**
     * Fetches all To-Do items from the database.
     *
     * @return List of To-Do objects.
     */
    List<Todo> fetchAllTodos();
    

    // Additional methods for your operations like delete, update, etc. can be added here.
}
