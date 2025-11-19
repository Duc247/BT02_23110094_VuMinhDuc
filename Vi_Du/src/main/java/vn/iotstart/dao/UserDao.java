package vn.iotstart.dao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstart.model.UsersModel;

public interface UserDao {
	UsersModel get(String username);
	void insert(UsersModel user);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	boolean reset_matkhau(String username, String password);
	
}
