
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class Session implements Comparable<Session>{
    
    private Member coach;
    private final Member[] attending;
    private Calendar date;
    private final boolean[] paid;
    private String type, hour, minute;
    private int inClass;
    
    public Session(Member givCoach, Calendar givDate, String givType, String givHour, String givMinute){
        
        coach = givCoach;
        date = givDate;
        type = givType;
        hour = givHour;
        minute = givMinute;
        attending = new Member[15];
        paid = new boolean[15];
        inClass = 0;
        
    }
    
    public Member getCoach(){
        
        return coach;
        
    }
    
    public Calendar getDate(){
        
        return date;
        
    }
    
    public String getType(){
        
        return type;
        
    }
    
    public String getTime(){
        
        return hour + minute;
        
    }
    
    public int getMembers(){
        
        return inClass;
        
    }
    
    public Member getMemberAt(int index){
        
        return attending[index];
        
    }
    
    public boolean hasPaid(int index){
        
        return paid[index];
        
    }
    
    public String toString(){
        
        return hour + ":" + minute + "  |    " + type + " with " + coach.getName();
        
    }
    
    private void setCoach(Member tempCoach){
        
        coach = tempCoach;
        
    }
    
    private void setDate(Calendar tempDate){
        
        date = tempDate;
        
    }
    
    private void setType(String tempType){
        
        type = tempType;
        
    }
    
    private void setHour(String tempHour){
        
        hour = tempHour;
        
    }
    
    private void setMinute(String tempMinute){
        
        minute = tempMinute;
        
    }
    
    public boolean addMember(Member newMember){
        
        if(inClass > 14)
            return false;
        attending[inClass] = newMember;
        paid[inClass] = false;
        inClass++;
        return true;
        
    }
    
    public boolean removeMember(Member tempMember){
        
        if(inClass == 0)
            return false;
        else{
            for(int i = 0; i < attending.length; i++){
                if(attending[i].getName().equals(tempMember.getName()))
                    return modify(i);
            }
        }
        return false;
        
    }
    
    private boolean modify(int index){
        
        for(int i = index; i < attending.length-1; i++){
            attending[i] = attending[i+1];
            paid[i] = paid[i+1];
        }
        attending[attending.length-1] = null;
        paid[paid.length-1] = false;
        inClass--;
        return true;
        
    }
    
    public void changePaid(int index, boolean change){
        
        paid[index] = change;
        
    }
    
    public int compareTo(Session other){
       if(Integer.parseInt(this.getTime()) < Integer.parseInt(other.getTime()))
           return -1;
        else if(Integer.parseInt(this.getTime()) > Integer.parseInt(other.getTime()))
            return 1;
        else 
            return 0;
       
   }
    
}
