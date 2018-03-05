public class metods {
    char cod;

    public boolean setCod(char colorcod) {
        if (colorcod == ' ') {
            return false;
        } else {
            this.cod = colorcod;
            return true;
        }
    }
}
