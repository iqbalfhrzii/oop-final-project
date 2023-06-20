package Main;
class HakAkses {
    private static String userLogin;
    public static void setUserLogin(String userLogin) {
        HakAkses.userLogin = userLogin;
    }
    
    public static String getUserLogin() {
        return userLogin;
    }
}
