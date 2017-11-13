package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.AgepopSQL;
import edu.matc.incarcerationanalyzer.entity.EthnicpopSQL;
import edu.matc.incarcerationanalyzer.entity.FacilitySQL;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HibernateDaoAndSQL {
    private final Logger logger = Logger.getLogger(this.getClass());
    Database database = Database.getInstance();
    Connection connection = null;
    ResultSet resultSet = null;

    public List<FacilitySQL> getQueryFromFacilitySQL(String sql) throws SQLException {
        List<FacilitySQL> users = new ArrayList<FacilitySQL>();

        resultSet = executeQuery(sql);
        creatingFacilitySQLListOfRecords(users, resultSet);
        database.disconnect();
        return users;
    }

    public List<AgepopSQL> getQueryFromAgeSQL(String sql) throws SQLException {
        List<AgepopSQL> users = new ArrayList<AgepopSQL>();
        //
        resultSet = executeQuery(sql);
        creatingAgePopSQLListOfRecords(users, resultSet);
        database.disconnect();
        return users;
    }

    public List<EthnicpopSQL> getQueryFromEthnicSQL(String sql) throws SQLException {
        List<EthnicpopSQL> users = new ArrayList<EthnicpopSQL>();

        resultSet = executeQuery(sql);
        creatingEthnicSQLListOfRecords(users, resultSet);
        database.disconnect();
        return users;
    }


    private ResultSet executeQuery(String sql) {
        ResultSet results = null;
        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            results = selectStatement.executeQuery(sql);
        } catch (SQLException e) {
            logger.info("HibernateDaoSQL.executeQuery().. Exception: " + e);
            //System.out.println("UserData.executeQuery()...Exception: " + e);
            e.printStackTrace();
        } catch (Exception e) {
            logger.info("HibernateDaoSQL.executeQuery()...Exception: " + e);
            //System.out.println("UserData.executeQuery()...Exception: " + e);
            e.printStackTrace();
        }
        return results;
    }

    private void creatingFacilitySQLListOfRecords(List<FacilitySQL> users, ResultSet results) throws SQLException {
        while (results.next()) {
            FacilitySQL records = createRecordFromFacility(results);
            users.add(records);
        }
    }

    private void creatingAgePopSQLListOfRecords(List<AgepopSQL> users, ResultSet results) throws SQLException {
        while (results.next()) {
            AgepopSQL records = createRecordFromAgePop(results);
            users.add(records);
        }
    }

    private void creatingEthnicSQLListOfRecords(List<EthnicpopSQL> users, ResultSet results) throws SQLException {
        while (results.next()) {
            EthnicpopSQL records = createRecordFromEthnicPop(results);
            users.add(records);
        }
    }

    /**
     *
     * This method add the data to the user class
     * @param results the resultset of the database
     * @return a user object with the data
     */
    private FacilitySQL createRecordFromFacility(ResultSet results) throws SQLException {
        FacilitySQL row = new FacilitySQL();
        row.setName(results.getString("name"));
        row.setPopulation(results.getInt("population"));
        row.setId(results.getInt("facilityid"));

        return row;
    }

    /**
     *
     * This method add the data to the user class
     * @param results the resultset of the database
     * @return a user object with the data
     */
    private AgepopSQL createRecordFromAgePop(ResultSet results) throws SQLException {
        AgepopSQL row = new AgepopSQL();
        row.setAgeId(results.getInt("ageid"));
        row.setFacilityId(results.getInt("facilityid"));
        row.setUnder18(results.getInt("under18"));
        row.setAge18to21(results.getInt("age18to21"));
        row.setAge22to25(results.getInt("age22to25"));
        row.setAge26to30(results.getInt("age26to30"));
        row.setAge31to35(results.getInt("age31to35"));
        row.setAge36to40(results.getInt("age36to40"));
        row.setAge41to45(results.getInt("age41to45"));
        row.setAge46to50(results.getInt("age46to50"));
        row.setAge51to55(results.getInt("age51to55"));
        row.setAge56to60(results.getInt("age56to60"));
        row.setAge61to65(results.getInt("age61to65"));
        row.setOver65(results.getInt("over65"));

        return row;
    }

    /**
     *
     * This method add the data to the user class
     * @param results the resultset of the database
     * @return a user object with the data
     */
    private EthnicpopSQL createRecordFromEthnicPop(ResultSet results) throws SQLException {
        EthnicpopSQL row = new EthnicpopSQL();
        row.setEthnicId(results.getInt("ethnicityid"));
        row.setFacilityId(results.getInt("facilityid"));
        row.setAsian(results.getInt("asian"));
        row.setBlack(results.getInt("black"));
        row.setHispanic(results.getInt("hispanic"));
        row.setWhite(results.getInt("white"));

        return row;
    }

    public void produceData(List<FacilitySQL> facilitySQL, List<EthnicpopSQL> ethnicpopSQL, List<AgepopSQL> agepopSQL){
        final Logger logger = Logger.getLogger(this.getClass());
        String sql = "";
        try {
            sql = "SELECT * FROM facility";
            facilitySQL = this.getQueryFromFacilitySQL(sql);

            sql="SELECT * FROM ethnicitypop";
            ethnicpopSQL = this.getQueryFromEthnicSQL(sql);

            sql="SELECT * FROM agepop";
            agepopSQL = this.getQueryFromAgeSQL(sql);
        } catch (SQLException e) {
            logger.info("StarupServlet.produceData().. Exception: " + e);
            e.printStackTrace();
        }
    }



}
