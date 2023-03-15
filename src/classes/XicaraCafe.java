package src.classes;

public class XicaraCafe {
    private int temp;
    private String preparo;

    public XicaraCafe(int temp, String preparo) {
        this.temp = temp;
        this.preparo = preparo;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }
}
