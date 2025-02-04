package ca.jrvs.apps.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCExecutor {

  public static final Logger LOGGER = LoggerFactory.getLogger(JDBCExecutor.class);

  public static void main(String[] args) {

    BasicConfigurator.configure();

    DatabaseConnectionManager dmc = new DatabaseConnectionManager
        ("localhost", "hplussport", "andres", "pass");

    try {
      Connection connection = dmc.getConnection();
      OrderDAO orderDAO = new OrderDAO(connection);
      Order order = orderDAO.findById(1000);
      System.out.println(order);
    } catch (SQLException e) {
      LOGGER.error("ERROR: Connecting or SQL statement", e);
    }
  }

}
