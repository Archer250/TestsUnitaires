package Maven;

public class User {
    private String _name;
    private String _forname;
    private String _mail;
    private String _password;

    public User(String _name, String _forname, String _mail) {
        this._name = _name;
        this._forname = _forname;
        this._mail = _mail;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getForname() {
        return _forname;
    }

    public void setForname(String _forname) {
        this._forname = _forname;
    }

    public String getMail() {
        return _mail;
    }

    public void setMail(String _mail) {
        this._mail = _mail;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        if() {
            this._password = _password;
        }
    }
    
    public boolean pregMatch(String pattern, String content) {
        return content.matches(pattern);
    }
}
