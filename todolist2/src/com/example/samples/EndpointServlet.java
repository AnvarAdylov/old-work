package com.example.samples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class EndpointServlet
 */
@WebServlet("/EndpointServlet")
public class EndpointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<String> listItems;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EndpointServlet() {
        super();
        listItems = new ArrayList<String>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new Gson();
		String json = gson.toJson(listItems);
		
		response.getWriter().append(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Map<String, String[]> m = request.getParameterMap();
	    
	    if (m.containsKey("newItem")) {
            String[] s = m.get("newItem");
            response.getWriter().append(s[0]);
            listItems.add(s[0]);
        }
	}

}
