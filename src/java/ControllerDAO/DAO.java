package ControllerDAO;

import context.DBContext;
import entity.Account;
import entity.MyOrder;
import entity.Product;
import entity.productCart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Khue Nguyen
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //OKE : check Account exist int DB
    public Account checkAccount(String user, String pass) {
        String query = "SELECT * FROM Account WHERE username=? AND password=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //Create new ACCOUNT
    public void ceateAccount(String user, String pass, String email,
            String role, String address, String phone, String date) {
        String query = "INSERT INTO Account VALUES (?, ?, ?, ?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, role);
            ps.setString(5, address);
            ps.setString(6, phone);
            ps.setString(7, date);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //get all records from db table products
    public List<Product> getAllImg() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM dbo.Products";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    // get all records from table account
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account \n"
                + "except select * from Account where creator = 1";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    // remove records from table products
    public void detele(String id) {
        String query = "DELETE FROM dbo.Products WHERE ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Admin update records from database
    public void UpdateProduct(String pName, int groupId, String detail, float price, String image,
            String Date, int order, int pID) {
        String query = "UPDATE dbo.Products SET ProductName = ?,Detail= ?,GroupProductID = ?,\n"
                + "Price=?,Image=?,Date =?,Order1= ? WHERE ProductID = ?";
        try {
            // để ý vị trí của dấu ? ở query với kiểu dữ liệu ps.set'???'.
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pName);
            ps.setString(2, detail);
            ps.setInt(3, groupId);
            ps.setFloat(4, price);
            ps.setString(5, image);
            ps.setString(6, Date);
            ps.setInt(7, order);
            ps.setInt(8, pID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // admin create new records
    public void CreateProduct(String pName, int gProduct,
            String detail, float price, String image, String date, int order) {
        String query = "INSERT INTO dbo.Products VALUES ( ? , ? ,  ? ,  ? , ? , ? ,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pName);
            ps.setInt(2, gProduct);
            ps.setString(3, detail);
            ps.setFloat(4, price);
            ps.setString(5, image);
            ps.setString(6, date);
            ps.setInt(7, order);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // insert feeback of user to table into database
    public void AddContact(int id, String name, String email,
            String subject, String mess, String dob, String phone, String address) {
        // khi insert can Lưu ý vị trí trong DB với set value phải trùng khớp 
        // mỗi dấu ? tương ứng với các vị trí trong bảng
        String query = "INSERT INTO Contact VALUES (?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, subject);
            ps.setString(5, mess);
            ps.setString(6, dob);
            ps.setString(7, phone);
            ps.setString(8, address);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //  khi bam add to cart thi se add vao DB
    //  Add product to cart
    public void insertToCart(int id, String name, float price, String image, String userName, int quatity) {
        String query = "INSERT INTO Cart VALUES (?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, image);
            ps.setFloat(3, price);
            ps.setString(4, name);
            ps.setString(5, userName);
            ps.setInt(6, quatity);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // save information of user when has change
    public void insertToInfor(String id, String name, String email, String address, String phone,
            String date, String sub) {
        String query = "INSERT INTO Information VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, date);
            ps.setString(7, sub);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // load records to card with each account 
    public List<productCart> list(String user) {
        List<productCart> list = new ArrayList<>();
        String query = "select * from Cart where userName = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new productCart(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    //delete records into card with each account other (khacs nhau)
    public void deleteProductCart(int id, String username) {
        String query = "delete from Cart where id = ? and userName =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // search product from name --> using JS to handing (***)
    public List<Product> searchProductName(String txt) {
        String query = "SELECT * FROM dbo.Products WHERE ProductName LIKE ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    // calculate all total page need to use
    public int totalPage() {
        int total = 0;
        String query = "SELECT COUNT(*) FROM dbo.Products";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int totalA = rs.getInt(1);
                total = totalA / 12;
                if (totalA % 12 != 0) {
                    total++;
                }
            }
        } catch (Exception e) {
        }
        return total;
    }

    // paging handing --> each page just has 12 records 
	
	
    public List<Product> paging(int index) {
        String query = "SELECT * FROM dbo.Products ORDER BY ProductID"
                + " OFFSET ? ROWS FETCH NEXT 12 ROWS ONLY";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index * 12 - 12));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    // when user add to card 1 product more one times --> quantity++
    public void updateQuatity(int id, int quatity) {
        String query = "update Cart set Quatity = ? where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, quatity);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // kiểm tra xem trong cart đã tồn tại sản phẩm này chưa
    public productCart getItemCartByName(int id, String username) {
        String query = "select * from Cart where id= ? and userName = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new productCart(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void MyOrder(String username, String name, float money, String address, String phone) {
        String query = "insert into [Orders] values (?,?,?,getdate(),?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, name);
            ps.setFloat(3, money);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteOrder(int mdh) {
        String query = "delete from Orders where mdh =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mdh);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<MyOrder> loadAllOrder(String username) {
        String query = "select * from [Orders] where UserName = ?";
        List<MyOrder> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new MyOrder(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

//    select * from Orders
    public List<MyOrder> loadAllOrder() {
        String query = " select * from Orders";
        List<MyOrder> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new MyOrder(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public void DeleteCartCheckOut(String userName) {
        String query = "delete from Cart where userName = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // not oke
    public void deleteAccount(int id) {
        String query = "delete from Account where UserId = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.deleteAccount(8);
    }
}
