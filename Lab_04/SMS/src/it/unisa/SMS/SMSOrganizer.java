package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    private List<SMS> orginizer;
    public SMSOrganizer(){
       this.orginizer = new ArrayList<SMS>();
    }

    public void addSMSToOrganizer(SMS sms){
        this.orginizer.add(sms);
    }

    public List<SMS> getListByDate(){
        List<SMS> ListByDate = new ArrayList<SMS>();
        for(SMS sms : orginizer){

        }
    }
}
