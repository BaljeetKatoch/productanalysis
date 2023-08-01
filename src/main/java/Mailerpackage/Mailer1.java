package Mailerpackage;

public class Mailer1 {
	MailerRepo mailerRepo;
	public Mailer1(MailerRepo mailerRepo)
	{
		this.mailerRepo=mailerRepo;
	}
	public Mailer getMessages(String sender)
	{
		return mailerRepo.getMailer(sender);
	}

}
