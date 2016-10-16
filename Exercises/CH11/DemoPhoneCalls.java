package CH11;

/**
 * Created by Luke on 16/10/2016.
 */
public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall inCall = new IncomingPhoneCall("0429-666-247");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("0420-420-420", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}