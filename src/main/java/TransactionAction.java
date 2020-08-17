import java.io.IOException;

public class TransactionAction extends HttpServlet {
    private static final long serialVersionUID = 1L;

    String amount = null;
    String account = null;

    public TransactionAction() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        amount = request.getParameter("uname");
        account = request.getParameter("pwd");

        System.out.println("UserName : "+uname);
        System.out.println("Password : "+pwd);
    }

}