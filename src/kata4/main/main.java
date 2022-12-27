package kata4.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kata4.view.EmailDomainLoader;
import kata4.view.FileLoader;
import kata4.view.HistogramDisplay;
import kata4.view.Loader;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class main {

    public static void main(String[] args) {
        Loader loader = new EmailDomainLoader(new MailListReader(new FileLoader(new File("email.txt"))));
        List<String> domains = loader.load();
        HistogramDisplay histDisplay = new HistogramDisplay("Histograma de e-mails",MailHistogramBuilder.build(domains));
    }

}