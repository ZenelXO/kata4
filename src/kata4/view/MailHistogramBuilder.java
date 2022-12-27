package kata4.view;

import java.util.List;
import kata4.model.Histogram;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<String> list){
        Histogram<String> hist = new Histogram<String>();

        for(String mail : list){
            hist.increment(mail);
        }
        return hist;
    }
}