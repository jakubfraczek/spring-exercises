package pl.sda.beans;


public class NewBean {

    private FirstBean firstBean;
    private SecondBean secondBean;
    private int number;

    public NewBean(FirstBean firstBean, SecondBean secondBean, int number) {
        this.firstBean = firstBean;
        this.secondBean = secondBean;
        this.number = number;
    }

    public FirstBean getFirstBean() {
        return firstBean;
    }

    public void setFirstBean(FirstBean firstBean) {
        this.firstBean = firstBean;
    }

    public SecondBean getSecondBean() {
        return secondBean;
    }

    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
