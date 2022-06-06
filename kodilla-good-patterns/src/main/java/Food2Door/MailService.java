package Food2Door;

public class MailService implements OrderInformationService{

    @Override
    public String inform(User user, OrderCreator order) {
        return "Sending email to: " + user;
    }
}
