package CH11;

/**
 * Created by Luke on 16/10/2016.
 */
public class PhoneCallArray
{
    public static void main(String[] args)
    {
        PhoneCall calls[] = new PhoneCall[10];
        int i;
        calls[0] = new IncomingPhoneCall("0429 666 247");
        calls[1] = new OutgoingPhoneCall("0420 420 420", 4);
        calls[2] = new IncomingPhoneCall("1337 420 666");
        calls[3] = new OutgoingPhoneCall("1111 222 333", 10);
        calls[4] = new IncomingPhoneCall("4532 453 785");
        calls[5] = new OutgoingPhoneCall("7250 783 123", 30);
        calls[6] = new IncomingPhoneCall("0783 484 787");
        calls[7] = new OutgoingPhoneCall("2350 955 371", 3);
        calls[8] = new IncomingPhoneCall("6454 564 572");
        calls[9] = new OutgoingPhoneCall("9920 787 819", 5);
        for(i = 0; i < calls.length; ++i)
            calls[i].getInfo();
    }
}