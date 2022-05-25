import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public Demo() {
	super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException, IOException{
		ObjectMapper mapper  = new ObjectMapper();
		JsonBean j = new JsonBean();
		String jsonData = mapper.writeValueAsString(j);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(jsonData);
		out.flush();
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(request.getReader());
		try {
			JsonBean user = mapper.readValue(request.getReader(), JsonBean.class);
			System.out.println(user);
		}catch(JsonGenerationException e) {
			e.printStackTrace();
		}catch(JsonMappingException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		JsonBean j = new JsonBean();
		String jsonData = mapper.writeValueAsString(j);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(jsonData);
		out.flush();
	}
	protected void doPut(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		ObjectMapper mapper  = new ObjectMapper();
		JsonBean j = new JsonBean();
		String jsonData = mapper.writeValueAsString(j);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(jsonData);
		out.flush();
	}
	protected void doDelete(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		ObjectMapper mapper  = new ObjectMapper();
		JsonBean j = new JsonBean();
		String jsonData = mapper.writeValueAsString(j);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(jsonData);
		out.flush();
		
	}
}