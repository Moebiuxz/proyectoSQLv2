package bd;

public class DatosConexion {
    private String server;
    private String bd;
    private String user;
    private String pass;

    public DatosConexion(String server, String bd, String user, String pass) {
        this.server = server;
        this.bd = bd;
        this.user = user;
        this.pass = pass;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}