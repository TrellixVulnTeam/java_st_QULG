package ex_005_servlet_and_dao;

/**
 * Created by Asus on 31.01.2018.
 */
public class DAOFactory {

    static DAOFactory factory;

    private DAOFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DAOFactory getInstance() {
        if (factory == null) {
            factory = new DAOFactory();
        }
        return factory;
    }

    public CarsshopDAO getCarsshopDAO() {
        return new CarsshopDAO();
    }

}
