package revisionpapergenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 14MEvans
 */
class DatabaseConnect {
    //Global Variables
    Connection conn;
    //Throws errors from opening the database
    DatabaseConnect() throws SQLException{
        //Connects the database to the project
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/RevisionProgramDB", "MEvans", "password");
    }
    
    public ResultSet runSelectQuery(String sQuery) throws SQLException{
        //Creates a prepared statement object
        PreparedStatement selQuery = conn.prepareStatement(sQuery);
        
        //Executing the query
        ResultSet rSet = selQuery.executeQuery();
        return rSet;
    }
        
    public void runInsert(String sQuery) throws SQLException{
        //Creates a prepared statement object
        PreparedStatement selQuery = conn.prepareStatement(sQuery);
        
        //Executing the query
        selQuery.executeUpdate();
    }

    
}
