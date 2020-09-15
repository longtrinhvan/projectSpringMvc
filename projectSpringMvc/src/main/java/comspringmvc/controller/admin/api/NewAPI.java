package comspringmvc.controller.admin.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springmvc.model.NewModel;
import com.springmvc.model.UserModel;
import com.springmvc.service.INewService;
import com.springmvc.service.utils.HttpUtil;
import com.springmvc.service.utils.SessionUtil;

@WebServlet(urlPatterns = { "/api-admin-new" })
public class NewAPI extends HttpServlet {

	@Autowired
	private INewService newService;

	private static final long serialVersionUID = -6078507093693647705L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		NewModel newModel = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		newModel.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL")).getUserName());
		newModel = newService.save(newModel);
		mapper.writeValue(resp.getOutputStream(), newModel);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		NewModel updateNew = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		updateNew.setModifiedBy(((UserModel) SessionUtil.getInstance().getValue(req, "USERMODEL")).getUserName());
		updateNew = newService.update(updateNew);
		mapper.writeValue(resp.getOutputStream(), updateNew);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		NewModel newModel = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		newService.delete(newModel.getIds());
		mapper.writeValue(resp.getOutputStream(), "{}");

	}

}
