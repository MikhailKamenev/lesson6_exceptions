package Access;

public class Access {
    private String login;
    private String password;
    private String confirmPassword;

    public Access(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

        public static void checkAccess(Access access) {
        try {
            checkLogin(access);
        }catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkPassword(access);
        }catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkConfirmPassword(access);
        }catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkLogin(Access access) throws WrongLoginException {
        if (access.getLogin().matches("^[a-zA-Z0-9_]+$") && access.getLogin().length() <= 20) {
            System.out.println("Логин ОК");
        } else {
            System.out.println("!!!ОШИБКА!!!");
            throw new WrongLoginException("Логин должен быть не длинее 20 символов и " +
                    "может состоять только из латинских букв, цифр и знака '_' ");
        }
    }

    public static void checkPassword(Access access) throws WrongPasswordException {
        if (access.getPassword().matches("^[a-zA-Z0-9_]+$") && access.getPassword().length() <= 20) {
            System.out.println("Пароль ОК");
        } else {
            System.out.println("!!!ОШИБКА!!!");
            throw new WrongPasswordException("Пароль должен быть не длинее 20 символов и " +
                    "может состоять только из латинских букв, цифр и знака '_' ");
        }
    }

    public static void checkConfirmPassword(Access access) throws WrongPasswordException {
        if (access.getConfirmPassword().equals(access.getPassword())) {
            System.out.println("Пароли совпадают.");
        } else {
            System.out.println("!!!ОШИБКА!!!");
            throw new WrongPasswordException("Введенный пароль не соответствует текущему.");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}

