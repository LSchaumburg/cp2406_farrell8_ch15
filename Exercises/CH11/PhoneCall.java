package CH11;

/**
 * Created by Luke on 16/10/2016.
 */
public abstract class PhoneCall
{
    String phoneNumber;
    double price;
    public PhoneCall(String num)
    {
        phoneNumber = num;
        price = 0.0;
    }
    public void setPrice(double phoneRate)
    {
        price = phoneRate;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}